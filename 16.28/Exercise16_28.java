import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise16_28 extends Application {
	private final static int NUMBER_OF_SLIDES = 10;
  	private int current = 0;
 	private String[] slides = new String[NUMBER_OF_SLIDES];

	@Override
	public void start(Stage primaryStage) {
		loadTextToSlides();

	    TextArea ta = new TextArea();
	    ta.setWrapText(true);
	    
	    StackPane pane = new StackPane();
	    pane.getChildren().add(new ScrollPane(ta));

	    Scene scene = new Scene(pane, 400, 200);
	    primaryStage.setTitle("Exercise16_28");
	    primaryStage.setScene(scene);
	    primaryStage.show();

	    Timeline animation = new Timeline(
	            new KeyFrame(Duration.millis(2000), e -> {
	              ta.setText(slides[current]);
	              current = (current + 1) % NUMBER_OF_SLIDES;
	              ;
	            }));
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play(); // Start animation

	    pane.setOnMouseClicked(e -> {
	      if (animation.getStatus() == Animation.Status.PAUSED) {
	        animation.play();
	      } else {
	        animation.pause();
	      }
	    });
	}

	private void loadTextToSlides() {
	    for (int i = 0; i < NUMBER_OF_SLIDES; i++) {
	      slides[i] = readAFile("text/slide" + i + ".txt");
	    }
	  }

	  private String readAFile(String file) {
	    String text = "";
	    try {
	      java.util.Scanner input = new java.util.Scanner(
	              new java.io.File(file));
	      while (input.hasNext()) {
	        text += input.nextLine() + "\n";
	      }
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }

	    return text;
  	}
}