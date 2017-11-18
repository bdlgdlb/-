import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise15_16 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle circle1 = new Circle(40, 40, 10);
		setProperties(circle1);
		Circle circle2 = new Circle(120, 150, 10);
		setProperties(circle2);

		pane.getChildren().addAll(getLine(circle1, circle2), circle1,
			circle2, getText(circle1, circle2));

		pane.setOnMouseDragged(e -> {
			if (circle1.contains(e.getX(), e.getY())) {
				pane.getChildren().clear();
				circle1.setCenterX(e.getX());
				circle1.setCenterY(e.getY());
				pane.getChildren().addAll(getLine(circle1, circle2), circle1,
					circle2, getText(circle1, circle2));
			}
			else if (circle2.contains(e.getX(), e.getY())) {
				pane.getChildren().clear();
				circle2.setCenterX(e.getX());
				circle2.setCenterY(e.getY());
				pane.getChildren().addAll(getLine(circle1, circle2), circle1,
					circle2, getText(circle1, circle2));
			}
		});

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise15_16");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Text getText(Circle circle1, Circle circle2) {
		return new Text((circle1.getCenterX() + circle2.getCenterX()) / 2, 
			(circle1.getCenterY() + circle2.getCenterY()) / 2, 
			distance(circle1, circle2));
	}

	private Line getLine(Circle circle1, Circle circle2) {
		return new Line(circle1.getCenterX(), circle1.getCenterY(),
			circle2.getCenterX(), circle2.getCenterY());
	}

	private void setProperties(Circle c) {
		c.setFill(Color.WHITE);
		c.setStroke(Color.BLACK);
	}

	private String distance(Circle c1, Circle c2) {
		double distance = Math.sqrt(Math.pow(c2.getCenterX() - c1.getCenterX(), 2)
			+ Math.pow(c2.getCenterY() - c1.getCenterY(), 2)) - 20;
		return String.format("%.0f", distance);
	}
}