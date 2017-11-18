import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_14 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		ObservableList<Double> list = polygon.getPoints();
		list.addAll(40.0, 20.0, 70.0, 40.0, 60.0, 80.0, 45.0, 45.0, 20.0, 60.0);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		pane.setOnMouseMoved(e -> {
			pane.getChildren().clear();
			Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
				(polygon.contains(e.getX(), e.getY()) ? "inside " : "outside ") +
				"the polygon");
			pane.getChildren().addAll(polygon, text);
		});

		Scene scene = new Scene(pane, 300, 150);
		primaryStage.setTitle("Exercise15_14");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}