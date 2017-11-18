import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_12 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle circle = new Circle(100, 60, 50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);

		pane.setOnMouseMoved(e -> {
			pane.getChildren().clear();
			Text text = new Text(e.getX(), e.getY(), "Mouse point is " + 
				(circle.contains(e.getX(), e.getY()) ? "inside " : "outside ") +
				"the circle");
			pane.getChildren().addAll(circle, text);
		});

		Scene scene = new Scene(pane, 350, 150);
		primaryStage.setTitle("Exercise15_12");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}