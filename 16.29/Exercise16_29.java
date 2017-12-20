import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Exercise16_29 extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();

	    CalendarPane calendarPane = new CalendarPane();
	    pane.setCenter(calendarPane);

	    Button btPrior = new Button("Prior");
	    Button btNext = new Button("Next");
	    HBox hBox = new HBox(5);
	    hBox.getChildren().addAll(btPrior, btNext);
	    pane.setBottom(hBox);
	    hBox.setAlignment(Pos.CENTER);

	    Scene scene = new Scene(pane, 600, 300);
	    primaryStage.setTitle("Exercise16_29");
	    primaryStage.setScene(scene);
	    primaryStage.show();

	    btPrior.setOnAction(e -> {
	      int currentMonth = calendarPane.getMonth();
	      if (currentMonth == 0) { 
	        calendarPane.setYear(calendarPane.getYear() - 1);
	        calendarPane.setMonth(11);
	      }
	      else {
	        calendarPane.setMonth((currentMonth - 1) % 12);
	      }
	    });
	    
	    btNext.setOnAction(e -> {
	      int currentMonth = calendarPane.getMonth();
	      if (currentMonth == 11)
	        calendarPane.setYear(calendarPane.getYear() + 1);

	      calendarPane.setMonth((currentMonth + 1) % 12);
	    });
	}
}