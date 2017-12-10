import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_26 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Arc arc = new Arc(100, 50, 75, 25, 0, -180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);

		Circle ball = new Circle(100, 75, 10);

		pane.getChildren().addAll(arc, ball);

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(arc);
		pt.setNode(ball);
		pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();

		FadeTransition ft = 
			new FadeTransition(Duration.millis(2000), ball);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();

		pane.setOnMousePressed(e -> {
			pt.pause();
			ft.pause();
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
			ft.play();
		});

		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setTitle("Exercise15_26");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}