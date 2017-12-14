import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise16_11 extends Application {
	private double paneWidth = 400;
  	private double paneHeight = 250;

	@Override
	public void start(Stage primaryStage) {
		BorderPane p = new BorderPane();
	    p.setLeft(new Label("Filename"));
	    TextField tfFilename = new TextField();
	    p.setCenter(tfFilename);
	    Button btView = new Button("View");
	    p.setRight(btView);

	    BorderPane pane = new BorderPane();
	    Histogram histogram = new Histogram();
	    pane.setCenter(histogram);
	    pane.setBottom(p);
	    p.setStyle("-fx-border-color: black");

	    Scene scene = new Scene(pane, paneWidth, paneHeight);
	    primaryStage.setTitle("Exercise16_11");
	    primaryStage.setScene(scene);
	    primaryStage.show();

	    int[] counts = new int[26];
	    
	    btView.setOnAction(e -> {
	      String filename = tfFilename.getText().trim();

	      try {
	        Scanner input = new Scanner(new File(filename));

	        while (input.hasNext()) {
	          String s = input.nextLine().toUpperCase();
	          for (int i = 0; i < s.length(); i++) {
	            if (Character.isLetter(s.charAt(i))) {
	              counts[s.charAt(i) - 'A']++;
	            }
	          }
	        }
	        
	        histogram.setCounts(counts);
	      } 
	      catch (FileNotFoundException ex) {
	        System.out.println("File not found: " + filename);
	      } 
	      catch (IOException ex) {
	        System.out.println(ex.getMessage());
	      }
	    });
	}
}