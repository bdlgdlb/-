import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class Exercise14_06 extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();

		int count = 0;
		double s = 50; 
		for (int i = 0; i < 8; i++) {
			count++;
			for (int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(s, s, s, s);
				if (count % 2 == 1)
					r.setFill(Color.WHITE);
				pane.add(r, j, i);
				count++;
			}
		}

		Scene scene = new Scene (pane);
		primaryStage.setTitle("Exercise14_06"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}