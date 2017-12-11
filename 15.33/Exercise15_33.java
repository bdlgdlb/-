import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_33 extends Application {
	final static double HGAP = 20;
	final static double VGAP = 20;
	final static double RADIUS = 5;
	final static double LENGTH_OF_SLOTS = 40;
	final static double LENGTH_OF_OPENNING = 15;
	final static double Y_FOR_FIRST_NAIL = 50;
	final static int NUMBER_OF_SLOTS = 9;
	final static int NUMBER_OF_ROWS = NUMBER_OF_SLOTS - 2;
	private double paneWidth = 300;
	private double paneHeight = 250;

	private double shift = paneWidth / 2;
	private int[] slots = new int[NUMBER_OF_SLOTS];
	private int numberOfBallsDropped = 0;
	private int moveCount = 0;
	private int position = 0;
	@Override
	public void start(Stage primaryStage) {	  
	BeanMachine pane = new BeanMachine();

	Scene scene = new Scene(pane, paneWidth, paneHeight);
	primaryStage.setTitle("Exercise15_33");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
}
