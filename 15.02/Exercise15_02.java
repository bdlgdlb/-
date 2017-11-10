import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise15_02 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(90);
		rectangle.setHeight(40);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.BLACK);

		Button btRotate = new Button("Rotate");

		btRotate.setOnAction(e -> 
			rectangle.setRotate(rectangle.getRotate() + 15));

		BorderPane pane = new BorderPane();
		pane.setCenter(rectangle);
		pane.setBottom(btRotate);
		BorderPane.setAlignment(rectangle, Pos.CENTER);
		BorderPane.setAlignment(btRotate, Pos.CENTER);
		pane.setPadding(new Insets(5, 5, 5, 5));

		Scene scene = new Scene(pane, 170, 170);
		primaryStage.setTitle("Exercise15_02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}