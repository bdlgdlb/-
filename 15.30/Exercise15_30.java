import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_30 extends Application {
	@Override
	public void start(Stage primaryStage) {
		ImagePane pane = new ImagePane();

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_15_30");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.requestFocus();
	}
}