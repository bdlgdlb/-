import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_29 extends Application {
	final static double HGAP = 20;
	final static double VGAP = 20;
	final static double RADIUS = 5;
	final static double LENGTH_OF_SLOTS = 40;
	final static double LENGTH_OF_OPENNING = 15;
	final static double Y_FOR_FIRST_NAIL = 50;
	final static double NUMBER_OF_SLOTS = 9;
	final static double NUMBER_OF_ROWS = NUMBER_OF_SLOTS - 2;
  
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
	    double paneWidth = 300;
	    double paneHeight = 250;  

	    double y = Y_FOR_FIRST_NAIL;
	    double centerX = paneWidth / 2;
	    
	    for (double i = 0; i < NUMBER_OF_ROWS; i++) {
	      y += VGAP;
	      for (double k = 0; k <= i; k++) {
	        Circle c = new Circle(centerX - i * HGAP / 2 + k * HGAP, y, RADIUS);
	        c.setFill(Color.GREEN);
	        pane.getChildren().add(c);
	      }
	    }
	    
	    y = y + RADIUS;
	    for (double i = 0; i < NUMBER_OF_SLOTS; i++) {
	      double x = centerX - (NUMBER_OF_ROWS - 1) * HGAP / 2 + (i - 1) * HGAP;
	      pane.getChildren().add(new Line(x, y, x, y + LENGTH_OF_SLOTS));
	    }
	    
	    pane.getChildren().add(new Line(centerX - (NUMBER_OF_ROWS - 1) * HGAP / 2 - HGAP, 
	      y + LENGTH_OF_SLOTS, centerX - (NUMBER_OF_ROWS - 1) * HGAP / 2 + NUMBER_OF_ROWS * HGAP, 
	      y + LENGTH_OF_SLOTS));
	    
	    pane.getChildren().add(new Line(centerX + HGAP / 2, Y_FOR_FIRST_NAIL + RADIUS, 
	        centerX - (NUMBER_OF_ROWS - 1) * HGAP / 2 + NUMBER_OF_ROWS * HGAP, y));
	    pane.getChildren().add(new Line(centerX - HGAP / 2, Y_FOR_FIRST_NAIL + RADIUS, 
	        centerX - (NUMBER_OF_ROWS - 1) * HGAP / 2 - HGAP, y));

	    pane.getChildren().add(new Line(centerX - HGAP / 2, Y_FOR_FIRST_NAIL + RADIUS, 
	        centerX - HGAP / 2, Y_FOR_FIRST_NAIL - LENGTH_OF_OPENNING));
	    pane.getChildren().add(new Line(centerX + HGAP / 2, Y_FOR_FIRST_NAIL + RADIUS, 
	        centerX + HGAP / 2, Y_FOR_FIRST_NAIL - LENGTH_OF_OPENNING));

	    Scene scene = new Scene(pane, paneWidth, paneHeight);
	    primaryStage.setTitle("Exercise14_29"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	}
}