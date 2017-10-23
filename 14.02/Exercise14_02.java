import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Exercise14_02 extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int n = (int)(Math.random() * 3);

				if (n == 0) 
					pane.add(new ImageView(new Image("image/o.gif")), j, i);
				else if (n == 1)
					pane.add(new ImageView(new Image("image/x.gif")), j, i);
				else 
					continue;
			}
		}

		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Exercise14_02"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}