import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class Exercise16_02 extends Application {
	protected Circle circle = new Circle(50);	
	protected Rectangle rectangle = new Rectangle();
	protected Ellipse ellipse = new Ellipse();

	@Override
	public void start(Stage primaryStage) {
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);
		rectangle.setWidth(150);
		rectangle.setFill(Color.WHITE);
		rectangle.setHeight(100);
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		ellipse.setRadiusX(100);
		ellipse.setRadiusY(50);

		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		RadioButton rbCircle = new RadioButton("Circle"); 
		RadioButton rbRectangle = new RadioButton("Rectangle"); 
		RadioButton rbEllipse = new RadioButton("Ellipse"); 

		ToggleGroup group = new ToggleGroup();
		rbCircle.setToggleGroup(group);
		rbRectangle.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);

		CheckBox chkFill = new CheckBox("Fill");

		paneForButtons.getChildren().addAll(rbCircle, 
			rbRectangle, rbEllipse, chkFill);

		StackPane paneForShapes = new StackPane();
		paneForShapes.setStyle("-fx-border-color: black");

		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		pane.setCenter(paneForShapes);

		rbCircle.setOnAction(e -> {
			if (rbCircle.isSelected()) {
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(circle);
			}
		});

		rbRectangle.setOnAction(e -> {
			if (rbRectangle.isSelected()) {
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(rectangle);
			}
		});

		rbEllipse.setOnAction(e -> {
			if (rbEllipse.isSelected()) {
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(ellipse);
			}
		});

		chkFill.setOnAction(e -> {
			if (chkFill.isSelected()) {
				circle.setFill(Color.BLACK);
				rectangle.setFill(Color.BLACK);
				ellipse.setFill(Color.BLACK);
			} 
			else {
				circle.setFill(Color.WHITE);
				rectangle.setFill(Color.WHITE);
				ellipse.setFill(Color.WHITE);			
			}
		});

		Scene scene = new Scene(pane, 400, 150);
		primaryStage.setTitle("Exercise16_02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}