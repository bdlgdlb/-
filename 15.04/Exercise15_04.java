import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Exercise15_04 extends Application {
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	private Button btAdd = new Button("Add");
	private Button btSubtract = new Button("Subtract");
	private Button btMultiply = new Button("Mulitply");
	private Button btDivide = new Button("Divide");

	@Override
	public void start(Stage primaryStage) {
		HBox hBox1 = new HBox(5);
		HBox hBox2 = new HBox(5);
		VBox vBox = new VBox(15);
		hBox1.getChildren().addAll(new Label("Number1: "), tfNumber1,
			new Label("Number2: "), tfNumber2, new Label("Result: "), tfResult);
		hBox2.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
		vBox.getChildren().addAll(hBox1, hBox2);

		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		tfNumber1.setPrefColumnCount(4);
		tfNumber2.setPrefColumnCount(4);
		tfResult.setPrefColumnCount(4);
		tfResult.setEditable(false);
		vBox.setPadding(new Insets(2, 5, 0, 0));

		btAdd.setOnAction(e -> add());
		btSubtract.setOnAction(e -> subtract());
		btMultiply.setOnAction(e -> multiply());
		btDivide.setOnAction(e -> divide());

		Scene scene = new Scene(vBox);
		primaryStage.setTitle("Exercise15_04");
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}

	private void add() {
		tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) +
			Double.parseDouble(tfNumber2.getText())));
	}

	private void subtract() {
		tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) -
			Double.parseDouble(tfNumber2.getText())));
	}

	private void multiply() {
		tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) *
			Double.parseDouble(tfNumber2.getText())));
	}

	private void divide() {
		tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) /
			Double.parseDouble(tfNumber2.getText())));
	}
}