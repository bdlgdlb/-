import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

public class Exercise16_07 extends Application {
	protected TextField tfHour = new TextField();
	protected TextField tfMinute = new TextField();
	protected TextField tfSecond = new TextField();
	protected ClockPane clock = new ClockPane();

	@Override
	public void start(Stage primaryStage) {
		tfHour.setPrefColumnCount(3);
		tfMinute.setPrefColumnCount(3);
		tfSecond.setPrefColumnCount(3);
		tfHour.setAlignment(Pos.CENTER_RIGHT);
		tfMinute.setAlignment(Pos.CENTER_RIGHT);
		tfSecond.setAlignment(Pos.CENTER_RIGHT);
		tfHour.setText(String.valueOf(clock.getHour()));
		tfMinute.setText(String.valueOf(clock.getMinute()));
		tfSecond.setText(String.valueOf(clock.getSecond()));

		HBox paneForTimeFields = new HBox(5);
		paneForTimeFields.setAlignment(Pos.CENTER);
		paneForTimeFields.getChildren().addAll(new Label("Hour"), tfHour, 
			new Label("Minute"), tfMinute, new Label("Second"), tfSecond);

		VBox pane = new VBox(20);
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(clock, paneForTimeFields);

		tfHour.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		tfMinute.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		tfSecond.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				setClock();
			}
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_07");
		primaryStage.setScene(scene);
		primaryStage.show();


		clock.setW(pane.getWidth());
		clock.setH(pane.getHeight() - 30);

		pane.widthProperty().addListener(ov ->
			clock.setW(pane.getWidth())
		);

		pane.heightProperty().addListener(ov ->
			clock.setH(pane.getHeight() - 30)
		);
	}

	private void setClock() {
		clock.setHour(Integer.parseInt(tfHour.getText()));
		clock.setMinute(Integer.parseInt(tfMinute.getText())); 
		clock.setSecond(Integer.parseInt(tfSecond.getText()));
	}
}