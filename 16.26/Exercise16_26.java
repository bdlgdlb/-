import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Exercise16_26 extends Application {

	@Override
	public void start(Stage primaryStage) {
		ImageView image = new ImageView(new Image(
			"http://cs.armstrong.edu/liang/common/image/flag6.gif"));

		MediaPlayer audio = new MediaPlayer(new Media(
			"http://cs.armstrong.edu/liang/common/audio/anthem/anthem6.mp3"));
		audio.play();

		Line line = new Line(250, 600, 250, -70);

		Pane pane = new Pane(image);

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(70000));
		pt.setPath(line);
		pt.setNode(image);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Exercise16_26");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}