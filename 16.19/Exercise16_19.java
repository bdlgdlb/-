import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.collections.ObservableList;

public class Exercise16_19 extends Application {
	protected Button btStartAll = new Button("Start All");
	protected Button btStopAll = new Button("Stop All");

	@Override 
	public void start(Stage primaryStage) {
		HBox paneForFans = new HBox(5);
		paneForFans.setAlignment(Pos.CENTER);
		paneForFans.getChildren().addAll(getFan(), getFan(), getFan());

		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(btStartAll, btStopAll);

		BorderPane pane = new BorderPane();
		pane.setCenter(paneForFans);
		pane.setBottom(paneForButtons);

		ObservableList<Node> list = paneForFans.getChildren();

		btStopAll.setOnAction(e -> {
			for (Node x : list) {
				((FanPane)((BorderPane)x).getCenter()).pause();
			}
		});

		btStartAll.setOnAction(e -> {
			for (Node x : list) {
				((FanPane)((BorderPane)x).getCenter()).play();
			}
		});

		Scene scene = new Scene(pane, 610, 200);
		primaryStage.setTitle("Exercise16_19");
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}

	public BorderPane getFan() {
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		HBox paneForButtons = new HBox(5);
		paneForButtons.getChildren().addAll(btPause, btResume, btReverse);

		FanPane fan = new FanPane();

		Slider slider = new Slider();
		slider.setMax(5);
		fan.rateProperty().bind(slider.valueProperty());

		BorderPane pane = new BorderPane();
		pane.setStyle("-fx-border-color: black");
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		return pane;
	}
}