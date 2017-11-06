import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Exercise14_21 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle circle1 = new Circle(Math.random() * 201, Math.random() * 201, 15);
		Circle circle2 = new Circle(Math.random() * 201, Math.random() * 201, 15);

		Line line = new Line(circle1.getCenterX(), circle1.getCenterY(),
			circle2.getCenterX(), circle2.getCenterY());

		double distance = Math.sqrt(Math.pow(line.getEndX() - line.getStartX(), 2)
			+ Math.pow(line.getEndY() - line.getStartY(), 2));
		double x = (line.getStartX() + line.getEndX()) / 2;
		double y = (line.getStartY() + line.getEndY()) / 2;
		Text text = new Text(x, y, String.valueOf(distance));
		pane.getChildren().addAll(circle1, circle2, line, text);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_21");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}