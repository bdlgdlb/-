import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise15_15 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		pane.setOnMouseClicked(e -> {
			// Create a circle
			Circle circle = new Circle(e.getX(), e.getY(), 10);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().add(circle);
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				ObservableList<Node> list = pane.getChildren();
				for (int i = 0; i < list.size(); i++) {
					Circle c = (Circle)list.get(i);
					if (circle.contains(c.getCenterX(), c.getCenterY())) {
						list.remove(i);
					}
				}
			}
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise15_15");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
