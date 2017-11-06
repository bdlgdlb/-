import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import java.util.ArrayList;

public class Exercise14_25 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		pane.setPadding(new Insets(10, 10, 10, 10));

		Circle circle = new Circle(100, 100, 80);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().addAll(circle);

		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();

		ArrayList<Double> angles = new ArrayList<>();
		for (int i = 0; angles.size() < 5; i++) {
			double angle = (Math.random() * (2 * Math.PI));
			if (!angles.contains(angle)) {
				angles.add(angle);
			}
		}

		java.util.Collections.sort(angles);

		for (int i = 0; i < angles.size(); i++) {
			list.add(circle.getCenterX() + circle.getRadius() * 
				Math.cos(angles.get(i)));
			list.add(circle.getCenterY() - circle.getRadius() * 
				Math.sin(angles.get(i)));
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_25");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}