import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_16 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new GridPane(), 200, 200);
		primaryStage.setTitle("Exercise_14_16");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

class GridPane extends Pane{
	public GridPane() {
		// Create four lines and set their properties
		Line line1 = new Line(0, 200 / 3, 200, 200 / 3);
		line1.startYProperty().bind(heightProperty().divide(3));
		line1.endYProperty().bind(heightProperty().divide(3));
		line1.endXProperty().bind(widthProperty());
		line1.setStroke(Color.BLUE);

		Line line2 = new Line();
		line2.startYProperty().bind(line1.startYProperty().multiply(2));
		line2.endYProperty().bind(line1.endYProperty().multiply(2));
		line2.endXProperty().bind(widthProperty());
		line2.setStroke(Color.BLUE);

		Line line3 = new Line(200 / 3, 0, 200 / 3, 200);
		line3.startXProperty().bind(widthProperty().divide(3));
		line3.endXProperty().bind(widthProperty().divide(3));
		line3.endYProperty().bind(heightProperty());
		line3.setStroke(Color.RED);

		Line line4 = new Line();
		line4.startXProperty().bind(line3.startXProperty().multiply(2));
		line4.endXProperty().bind(line3.endXProperty().multiply(2));
		line4.endYProperty().bind(heightProperty());
		line4.setStroke(Color.RED);

		// Place lines in pane
		getChildren().addAll(line1, line2, line3, line4); 
	}
}