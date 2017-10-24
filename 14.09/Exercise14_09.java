import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class Exercise14_09 extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				StackPane stackPane = new StackPane();

				Circle circle = getCircle();
				stackPane.getChildren().add(circle);
				getArcs(stackPane);
				gridPane.add(stackPane, i, j);
			}
		}

		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Exercise14_09"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}

	public Circle getCircle() {
		Circle c = new Circle();
		c.setRadius(100);
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		return c;
	}

	public void getArcs(StackPane stackPane) {
		double angle = 30;
		for (int i = 0; i < 4; i++) {
			Pane pane = new Pane();
			Arc arc = new Arc(100, 100, 80, 80, angle + 90, 35);
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND);
			pane.getChildren().add(arc);
			stackPane.getChildren().add(pane);
			angle += 90;
		}
	}
}