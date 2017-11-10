import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class Exercise15_01 extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setPadding(new Insets(5, 5, 5, 5));

		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5, 5));
		getCards(hBox);

		Button btRefresh = new Button("Refresh");
		btRefresh.setOnAction(e -> getCards(hBox));
		vBox.getChildren().addAll(hBox, btRefresh);

		Scene scene = new Scene(vBox);
		primaryStage.setTitle("Exercise15_01");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void getCards(HBox pane) {
		pane.getChildren().clear();
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			cards.add(i + 1);
		}

		java.util.Collections.shuffle(cards);

		for (int i = 0; i < 4; i++) {
			pane.getChildren().add(new ImageView(new Image("image/card/" +
				cards.get(i) + ".png")));
		}
	}
}