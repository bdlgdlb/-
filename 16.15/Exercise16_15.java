import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

public class Exercise16_15 extends Application {
	protected ComboBox<String> cbo = new ComboBox<>();

	@Override
	public void start(Stage primaryStage) {
		cbo.getItems().addAll("TOP", "BOTTOM", "LEFT", "RIGHT");
		cbo.setStyle("-fx-color: green");
		cbo.setValue("LEFT");

		TextField tfGap = new TextField("0");
		tfGap.setPrefColumnCount(3);

		HBox paneForSettings = new HBox(10);
		paneForSettings.setAlignment(Pos.CENTER);
		paneForSettings.getChildren().addAll(new Label("contentDisplay:"),
			cbo, new Label("graphicTextGap:"), tfGap);

		ImageView image = new ImageView(new Image("image/grapes.gif"));

		Label lblGrapes = new Label("Grapes", image);
		lblGrapes.setGraphicTextGap(0);

		StackPane paneForImage = new StackPane(lblGrapes);

		cbo.setOnAction(e -> {
			lblGrapes.setContentDisplay(setDisplay());
		});

		tfGap.setOnAction(e -> {
			lblGrapes.setGraphicTextGap(Integer.parseInt(tfGap.getText()));
		});

		BorderPane pane = new BorderPane();
		pane.setTop(paneForSettings);
		pane.setCenter(paneForImage);

		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Exercise16_15");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private ContentDisplay setDisplay() {
		if (cbo.getValue().equals("TOP"))
			return ContentDisplay.TOP;
		else if (cbo.getValue().equals("BOTTOM"))
			return ContentDisplay.BOTTOM;
		else if (cbo.getValue().equals("LEFT"))
			return ContentDisplay.LEFT;
		else
			return ContentDisplay.RIGHT; 
	}
}