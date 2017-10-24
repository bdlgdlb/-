import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class Exercise14_10 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Ellipse ellipse = new Ellipse(150, 100, 100, 50);
		ellipse.setStroke(Color.BLACK);
		ellipse.setFill(Color.WHITE);

		Arc arc1 = new Arc(ellipse.getCenterX(), 250, ellipse.getRadiusX(), 
			ellipse.getRadiusY(), 0, -180);
		arc1.setType(ArcType.OPEN);
		arc1.setFill(Color.WHITE);
		arc1.setStroke(Color.BLACK);

		Arc arc2 = new Arc(ellipse.getCenterX(), arc1.getCenterY(), 
			ellipse.getRadiusX(), ellipse.getRadiusY(), 0, 180);
		arc2.setType(ArcType.OPEN);
		arc2.setFill(Color.WHITE);
		arc2.setStroke(Color.BLACK);
		arc2.getStrokeDashArray().addAll(6.0, 21.0);

		Line line1 = new Line(ellipse.getCenterX() - ellipse.getRadiusX(), 
			ellipse.getCenterY(), ellipse.getCenterX() - ellipse.getRadiusX(),
			arc1.getCenterY());
		Line line2 = new Line((ellipse.getCenterX() - ellipse.getRadiusX()) + 
			ellipse.getRadiusX() * 2, ellipse.getCenterY(), 
			(ellipse.getCenterX() - ellipse.getRadiusX()) 
			+ ellipse.getRadiusX() * 2, arc1.getCenterY());

		pane.getChildren().addAll(ellipse, arc1, arc2, line1, line2);

		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Exercise14_10"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}