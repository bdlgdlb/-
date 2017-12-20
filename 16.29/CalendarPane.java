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

class CalendarPane extends BorderPane {
	  private String[] monthName = {"January", "Feburary", "March", "April", "May",
	    "June", "July", "August", "September", "October", "November", "December"};
	  
	  private Label lblHeader = new Label();

	  private Label[] lblDay = new Label[49];

	  private Calendar calendar;
	  private int month;
	  private int year;

	  public CalendarPane() {
	    for (int i = 0; i < 49; i++) {
	      lblDay[i] = new Label();
	      lblDay[i].setTextAlignment(TextAlignment.RIGHT);
	    }

	    lblDay[0].setText("Sunday");
	    lblDay[1].setText("Monday");
	    lblDay[2].setText("Tuesday");
	    lblDay[3].setText("Wednesday");
	    lblDay[4].setText("Thursday");
	    lblDay[5].setText("Friday");
	    lblDay[6].setText("Saturday");

	    GridPane dayPane = new GridPane();
	    dayPane.setAlignment(Pos.CENTER);

	    dayPane.setHgap(10);
	    dayPane.setVgap(10);
	    for (int i = 0; i < 49; i++) {
	      dayPane.add(lblDay[i], i % 7, i / 7);
	    }

	    this.setTop(lblHeader);
	    BorderPane.setAlignment(lblHeader, Pos.CENTER);
	    this.setCenter(dayPane);

	    calendar = new GregorianCalendar();
	    month = calendar.get(Calendar.MONTH);
	    year = calendar.get(Calendar.YEAR);
	    updateCalendar();

	    showHeader();
	    showDays();
	  }

	  public void showHeader() {
	    lblHeader.setText(monthName[month] + ", " + year);
	  }

	  public void showDays() {
	    int startingDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);

	    Calendar cloneCalendar = (Calendar) calendar.clone();
	    cloneCalendar.add(Calendar.DATE, -1); 
	    int daysInPrecedingMonth = cloneCalendar.getActualMaximum(
	            Calendar.DAY_OF_MONTH);

	    for (int i = 0; i < startingDayOfMonth - 1; i++) {
	      lblDay[i + 7].setTextFill(Color.LIGHTGRAY);
	      lblDay[i + 7].setText(daysInPrecedingMonth
	              - startingDayOfMonth + 2 + i + "");
	    }

	    int daysInCurrentMonth = calendar.getActualMaximum(
	            Calendar.DAY_OF_MONTH);
	    for (int i = 1; i <= daysInCurrentMonth; i++) {
	      lblDay[i - 2 + startingDayOfMonth + 7].setTextFill(Color.BLACK);
	      lblDay[i - 2 + startingDayOfMonth + 7].setText(i + "");
	    }

	    int j = 1;
	    for (int i = daysInCurrentMonth - 1 + startingDayOfMonth + 7;
	            i < 49; i++) {
	      lblDay[i].setTextFill(Color.LIGHTGRAY);
	      lblDay[i].setText(j++ + "");
	    }
	  }

	  public void updateCalendar() {
	    calendar.set(Calendar.YEAR, year);
	    calendar.set(Calendar.MONTH, month);
	    calendar.set(Calendar.DATE, 1);
	  }

	 
	  public int getMonth() {
	    return month;
	  }

	 
	  public void setMonth(int newMonth) {
	    month = newMonth;
	    updateCalendar();
	    showHeader();
	    showDays();
	  }

	  public int getYear() {
	    return year;
	  }

	  
	  public void setYear(int newYear) {
	    year = newYear;
	    updateCalendar();
	    showHeader();
	    showDays();
	  }
}
