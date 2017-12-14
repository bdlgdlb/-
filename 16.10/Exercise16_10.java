import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.io.*;
import java.util.*;

public class Exercise16_10 extends Application {
	protected TextField tfFileName = new TextField();
	protected TextArea taTextFile = new TextArea();

	@Override
	public void start(Stage primaryStage) {
		tfFileName.setPrefColumnCount(23);

		Button btView = new Button("View");

		HBox paneForTextField = new HBox();
		paneForTextField.getChildren().addAll(new Label("Filename"), 
			tfFileName, btView);

		taTextFile.setEditable(false);
		taTextFile.setWrapText(true);

		ScrollPane scrollPane = new ScrollPane(taTextFile);

		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(scrollPane, paneForTextField);

		btView.setOnAction(e -> {
			try {
				getTextFile();
			}
			catch (FileNotFoundException ex) {
				taTextFile.setText("Error! File Not Found.");
			}
		});

		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setTitle("Exercise16_10");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void getTextFile() throws FileNotFoundException {
		// Check if source file exists
		File file = new File(tfFileName.getText());
		if (!file.exists()) {
			taTextFile.setText(tfFileName.getText() + " does not exist");
		}
		else {
			String text = "";
			try (
				// Create input file
				Scanner input = new Scanner(file);
			) {
				while (input.hasNext()) {
					text += input.nextLine();
					text += "\n";
				}
				taTextFile.setText(text);
			}
		}	
	}
}