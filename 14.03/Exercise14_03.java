import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

public class Exercise14_03 extends Application {
	@Override
	public void start(Stage primaryStage) {
		ArrayList<Integer> cards = getCards();

		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		for (int i = 0; i < 3; i++) {
			pane.getChildren().add(new ImageView(new Image("image/card/" +
				cards.get(i) + ".png")));
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_03"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	private ArrayList<Integer> getCards() {
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			cards.add(i + 1);
		}
		java.util.Collections.shuffle(cards);
		return cards;
	}
}