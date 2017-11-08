import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise14_27 extends Application {
	@Override
	public void start(Stage primaryStage) {
		ClockPane clock = new ClockPane();
	    String timeString = clock.getHour() + ":" + clock.getMinute() 
	      + ":" + clock.getSecond();
	    Label lblCurrentTime = new Label(timeString);

	    BorderPane pane = new BorderPane();
	    pane.setCenter(clock);
	    pane.setBottom(lblCurrentTime);
	    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

	    Scene scene = new Scene(pane, 250, 250);
	    primaryStage.setTitle("Exercise14_27");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
}