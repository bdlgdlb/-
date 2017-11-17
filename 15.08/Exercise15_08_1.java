import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Exercise15_08_1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		pane.setOnMouseClicked(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(new Text(e.getX(), e.getY(),
				"(" + e.getX() + ", " + e.getY() + ")"));
		});

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise15_08a");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}