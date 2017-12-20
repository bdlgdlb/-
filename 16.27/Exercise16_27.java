import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class Exercise16_27 extends Application {
	private String[] flagTitles = {"Canada", "China", "Denmark", 
      "France", "Germany", "India", "Norway", "United Kingdom",
      "United States of America"};

  	private ImageView[] flagImage = {new ImageView("image/ca.gif"),
      	new ImageView("image/china.gif"), 
  		new ImageView("image/denmark.gif"), 
      	new ImageView("image/fr.gif"), 
      	new ImageView("image/germany.gif"),
      	new ImageView("image/india.gif"), 
      	new ImageView("image/norway.gif"),
      	new ImageView("image/uk.gif"), new ImageView("image/us.gif")};

  	private String[] flagDescription = new String[9];

  	private DescriptionPane descriptionPane = new DescriptionPane();

  	private ComboBox<String> cbo = new ComboBox<>(); 

	@Override
	public void start(Stage primaryStage) {
		for (int i = 0; i < 9; i++) {
      		flagDescription[i] = getDescription(i);
    	}

    	setDisplay(0);

    	BorderPane pane = new BorderPane();
      
    	BorderPane paneForComboBox = new BorderPane();
    	paneForComboBox.setLeft(new Label("Select a country: "));
    	paneForComboBox.setCenter(cbo);
    	pane.setTop(paneForComboBox);
    	cbo.setPrefWidth(400);
    	cbo.setValue("Canada");
    
    	ObservableList<String> items = 
			FXCollections.observableArrayList(flagTitles);
    	cbo.getItems().addAll(items); 
    	pane.setCenter(descriptionPane);
    
    	cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
    
    	Scene scene = new Scene(pane, 450, 170);
    	primaryStage.setTitle("Exercise16_26");
    	primaryStage.setScene(scene); 
    	primaryStage.show();
	}

	public void setDisplay(int index) {
	    descriptionPane.setTitle(flagTitles[index]);
	    descriptionPane.setImageView(flagImage[index]);
	    descriptionPane.setDescription(flagDescription[index]);
	  }

    private String getDescription(int i) {
	    StringBuilder result = new StringBuilder();

	    try {
	      Scanner input = new Scanner(new File(
	        "text/description" + i + ".txt"));

	      while (input.hasNext()) {
	        result.append(input.nextLine() + '\n');
	      }
	    }
	    catch (IOException ex) {
	      System.out.println(ex);
	    }

	    return result.toString();
  	}
    
}