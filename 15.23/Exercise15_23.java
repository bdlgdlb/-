import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Exercise15_23 extends Application {
	private double paneWidth = 200, paneHeight = 200;
   private Polygon polygon = new Polygon();
   private ObservableList<Double> list = polygon.getPoints();

	@Override
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
    
	    setValues();
	    
	    polygon.setFill(Color.RED);

	    Text text = new Text("STOP");
	    text.setFill(Color.WHITE);
	    text.setFont(Font.font("Times New Roman", 40));
	    
	    pane.getChildren().addAll(polygon, text);

	    Scene scene = new Scene(pane, paneWidth, paneHeight);
	    primaryStage.setTitle("Exercise15_23");
	    primaryStage.setScene(scene);
	    primaryStage.show();

	     scene.widthProperty().addListener(ov -> {
      paneWidth = pane.getWidth();
      setValues(); 
    });
    
    scene.heightProperty().addListener((ov, oldVal, newVal) -> {
      paneHeight = pane.getHeight();
      setValues(); 
    });
	}

	private void setValues() {
    double centerX = paneWidth / 2, centerY = paneHeight / 2;
    double radius = Math.min(paneWidth, paneHeight) * 0.4;
        
    // Add points to the polygon list
    list.clear();
    for (int i = 0; i < 8; i++) {
      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 - Math.PI / 8)); 
      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8 - Math.PI / 8));
    }     
  }
}