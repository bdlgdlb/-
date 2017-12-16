import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;

public class Exercise16_22 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button play = new Button("Play");
		Button loop = new Button("Loop");
		Button stop = new Button("Stop");

		HBox pane = new HBox(5);
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().addAll(play, loop, stop);

		AudioClip audio = new AudioClip(
			"http://cs.armstrong.edu/liang/common/audio/anthem/anthem3.mp3");

		play.setOnAction(e -> {
			audio.play();
		});

		stop.setOnAction(e -> {
			audio.stop();
		});

		loop.setOnAction(e -> {
			audio.setCycleCount(AudioClip.INDEFINITE);
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_22");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}