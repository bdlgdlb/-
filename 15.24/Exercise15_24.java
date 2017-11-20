import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_24 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Arc arc = new Arc(100, 50, 75, 25, 0, -180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);

		Circle circle = new Circle(100, 75, 5);

		pane.getChildren().addAll(arc, circle);

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(arc);
		pt.setNode(circle);
		pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();

		pane.setOnMousePressed(e -> {
			pt.pause();
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
		});

		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setTitle("Exercise15_24");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}