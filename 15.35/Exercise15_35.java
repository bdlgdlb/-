import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_35 extends Application {
	private double paneWidth = 300;
  	private double paneHeight = 250;

	@Override
	public void start(Stage primaryStage) {
		Lattice lattice = new Lattice();

	    BorderPane borderPane = new BorderPane();
	    borderPane.setCenter(lattice);
	    Button btStart = new Button("Start");
	    btStart.setOnAction(e -> lattice.getAPath());
	    borderPane.setBottom(btStart);
	    BorderPane.setAlignment(btStart, Pos.CENTER);

	    Scene scene = new Scene(borderPane, paneWidth, paneHeight + 40);
	    primaryStage.setTitle("Exercise15_35");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
}