import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;

public class Exercise16_03 extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox paneForCircles = new VBox(5);
		paneForCircles.setAlignment(Pos.CENTER);

		Circle c1 = getCircle();
		Circle c2 = getCircle();
		Circle c3 = getCircle();
		c1.setFill(Color.RED);

		paneForCircles.getChildren().addAll(c1, c2, c3);

		Rectangle rectangle = new Rectangle();
		rectangle.setFill(Color.WHITE);
		rectangle.setWidth(30);
		rectangle.setHeight(100);
		rectangle.setStroke(Color.BLACK);
		rectangle.setStrokeWidth(2);
		StackPane stopSign = new StackPane(rectangle, paneForCircles);

		HBox paneForRadioButtons = new HBox(5);
		paneForRadioButtons.setAlignment(Pos.CENTER);

		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbGreen = new RadioButton("Green");

		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbRed.setSelected(true);
		paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbGreen);

		BorderPane pane = new BorderPane();
		pane.setCenter(stopSign);
		pane.setBottom(paneForRadioButtons);

		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				c1.setFill(Color.RED);
				c2.setFill(Color.WHITE);
				c3.setFill(Color.WHITE);
			}
		});

		rbYellow.setOnAction(e -> {
			if (rbYellow.isSelected()) {
				c1.setFill(Color.WHITE);
				c2.setFill(Color.YELLOW);
				c3.setFill(Color.WHITE);
			}
		});

		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				c1.setFill(Color.WHITE);
				c2.setFill(Color.WHITE);
				c3.setFill(Color.GREEN);
			}
		});

		Scene scene = new Scene(pane, 200, 150);
		primaryStage.setTitle("Exercise16_03");
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	
	/** Return a circle */
	private Circle getCircle() {
		Circle c = new Circle(10);
		c.setFill(Color.WHITE);
		c.setStroke(Color.BLACK);
		return c;
	}
	
}