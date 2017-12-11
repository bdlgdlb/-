import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Exercise15_32 extends Application {
	@Override
	public void start(Stage primaryStage) {
		ClockPane clock = new ClockPane();

		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);

		Button btStop = new Button("Stop");
		Button btStart = new Button("Start");

		btStop.setOnAction(e -> clock.pause());
		btStart.setOnAction(e -> clock.play());

		hBox.getChildren().addAll(btStop, btStart);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(clock);
		borderPane.setBottom(hBox);

		Scene scene = new Scene(borderPane, 250, 270);
		primaryStage.setTitle("Exercise_15_32");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}