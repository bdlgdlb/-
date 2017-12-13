import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;

public class Exercise16_04 extends Application {
	final double KILOMETERS_PER_MILE = 1.602307322544464;
	protected TextField tfMile = new TextField();
	protected TextField tfKilometer = new TextField();


	@Override
	public void start(Stage primaryStage) {
		tfMile.setAlignment(Pos.BOTTOM_RIGHT);
		tfKilometer.setAlignment(Pos.BOTTOM_RIGHT);

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.add(new Label("Mile"), 0, 0);
		pane.add(tfMile, 1, 0);
		pane.add(new Label("Kilometer"), 0, 1);
		pane.add(tfKilometer, 1, 1);

		tfMile.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER &&
				tfMile.getText().length() > 0) {
				double miles = Double.parseDouble(tfMile.getText());
				tfKilometer.setText(String.valueOf(miles * KILOMETERS_PER_MILE));
			}
		});

		tfKilometer.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER &&
				tfKilometer.getText().length() > 0) {
				double kilometers = Double.parseDouble(tfKilometer.getText());
				tfMile.setText(String.valueOf(kilometers / KILOMETERS_PER_MILE));
			}
		});

		Scene scene = new Scene(pane, 250, 60);
		primaryStage.setTitle("Exercise16_04");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}