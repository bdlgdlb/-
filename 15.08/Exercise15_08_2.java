import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_08_2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Text text = new Text();
		pane.setOnMousePressed(e -> {
			text.setText("(" + e.getX() + ", " + e.getY() + ")");
				
			text.setX(e.getX());
			text.setY(e.getY());
			pane.getChildren().add(text);
			
		});
		pane.setOnMouseDragged(e -> {
			
			text.setText("(" + e.getX() + ", " + e.getY() + ")");
			text.setX(e.getX());
			text.setY(e.getY());	
			// pane.getChildren().add(text);
		});

		pane.setOnMouseReleased(e -> {
			pane.getChildren().clear();
		});

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise15_08b"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}