import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise15_18 extends Application {
	@Override 
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Rectangle rectangle = new Rectangle(5, 5, 30, 20);
		pane.getChildren().add(rectangle);

		pane.setOnMouseDragged(e -> {
			if (rectangle.contains(e.getX(), e.getY())) {
				pane.getChildren().clear();
				rectangle.setX(e.getX() - rectangle.getWidth() * .5);
				rectangle.setY(e.getY() - rectangle.getHeight() * .5);
				pane.getChildren().add(rectangle);
			}
		});

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise15_18");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}