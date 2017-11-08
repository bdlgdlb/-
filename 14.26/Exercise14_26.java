import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class Exercise14_26 extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox pane = new HBox(10);
		pane.setPadding(new Insets(0, 20, 20, 0));

		ClockPane clock1 = new ClockPane(4, 20, 45);
		ClockPane clock2 = new ClockPane(22, 46, 15);

		pane.getChildren().addAll(clock1, clock2);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_26");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}