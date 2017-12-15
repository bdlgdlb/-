import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class Exercise16_20 extends Application {
	protected Button btStart = new Button("Start");
	protected Button btClear = new Button("Clear");

	@Override
	public void start(Stage primaryStage) {
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(btStart, btClear);

		StopWatch stopWatch = new StopWatch();

		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		pane.setCenter(stopWatch);

		btStart.setOnAction(e -> {
			if (btStart.getText().equals("Start") ||
				 btStart.getText().equals("Resume")) {
				stopWatch.play();
				btStart.setText("Pause");
			} else {
				stopWatch.pause();
				btStart.setText("Resume");
			}
		});

		btClear.setOnAction(e -> {
			stopWatch.clear();
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_20");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}