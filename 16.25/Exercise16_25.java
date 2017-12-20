import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;

public class Exercise16_25 extends Application {
	protected HBox paneForSpeed = new HBox(5);
	protected VBox paneForCars = new VBox(5);
	protected ObservableList<Node> textFields = paneForSpeed.getChildren();
	protected ObservableList<Node> cars = paneForCars.getChildren();

	@Override
	public void start (Stage primaryStage) {
		final int NUMBER_OF_CARS = 4;
		final int PREF_COLUMN_COUNT = 2;

		paneForSpeed.setAlignment(Pos.CENTER);

		for (int i = 0; i < NUMBER_OF_CARS; i++) {
			paneForSpeed.getChildren().addAll(
				new Label("Car " + (i + 1) + ":"), new TextField());
		}

		for (int i = 1; i < textFields.size(); i+= 2) {
			((TextField)textFields.get(i)).setPrefColumnCount(PREF_COLUMN_COUNT);
		}

		for (int i = 0; i < NUMBER_OF_CARS; i++) {
			paneForCars.getChildren().add(new CarPane());
		}

		for (Node car: cars) {
			((CarPane)car).setStyle("-fx-border-color: black");
			((CarPane)car).setY(40);
		}

		for (int i = 1; i < textFields.size(); i += 2) {
			((TextField)textFields.get(i)).setOnKeyPressed(e -> {
				if (e.getCode() == KeyCode.ENTER) {
					setSpeed();
				}
			});

		}
		
		BorderPane pane = new BorderPane();
		pane.setTop(paneForSpeed);
		pane.setCenter(paneForCars);

		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Exercise16_25");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void setSpeed() {
		for (int i = 1, j = 0; i < textFields.size(); i += 2, j++) {
			if (((TextField)textFields.get(i)).getText().length() > 0) {
				((CarPane)cars.get(j)).setSpeed(
					Double.parseDouble(((TextField)textFields.get(i)).getText()));
				((CarPane)cars.get(j)).play();
			}
			else {
				((CarPane)cars.get(j)).pause();
			}
		}
	}
}