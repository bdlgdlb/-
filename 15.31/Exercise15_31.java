import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_31 extends Application {
	@Override
	public void start(Stage primaryStage) {
		 PalindromePane pane = new PalindromePane();
    
	    Scene scene = new Scene(pane, 300, 300);
	    primaryStage.setTitle("Exercise15_31");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    Timeline animation = new Timeline(
	      new KeyFrame(Duration.millis(100), e -> {pane.next();}));
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play();
	    
	    pane.requestFocus();
	    pane.setOnKeyPressed(e -> {
	      if (e.getCode() == KeyCode.UP) {
	        animation.setRate(animation.getRate() + 1);
	      }
	      else if (e.getCode() == KeyCode.DOWN) {
	        animation.setRate(animation.getRate() >= 1 ? animation.getRate() - 1 : 0);
	      }

	      else if (e.getCode() == KeyCode.S) {
	      	animation.pause();
	      }

	      else if (e.getCode() == KeyCode.R) {
	      	animation.play();
	      }
	    });
	}
}