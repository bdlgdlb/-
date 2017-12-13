import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;

public class Exercise16_08 extends Application {
	protected TextField tfCircle1CenterX = new TextField();
	protected TextField tfCircle1CenterY = new TextField();
	protected TextField tfCircle1Radius = new TextField();
	protected TextField tfCircle2CenterX = new TextField();
	protected TextField tfCircle2CenterY = new TextField();
	protected TextField tfCircle2Radius = new TextField();
	protected Circle circle1 = getCircle(52.0, 60.0, 30);
	protected Circle circle2 = getCircle(180.0, 56.0, 40);
	protected Rectangle rectangle = getRectangle();
	protected Pane circlesPane = new Pane(rectangle, circle1, circle2);


	@Override
	public void start(Stage primaryStage) {
		setTextProperties();

		VBox paneForTable1 = getTable(tfCircle1CenterX, 
			tfCircle1CenterY, tfCircle1Radius, 1);
		
		VBox paneForTable2 = getTable(tfCircle2CenterX, 
			tfCircle2CenterY, tfCircle2Radius, 2);
		
		HBox paneForTables = new HBox(5);
		paneForTables.setAlignment(Pos.CENTER);
		paneForTables.getChildren().addAll(paneForTable1, paneForTable2);

		Button btRedrawCircles = new Button("Redraw Circles");

		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(intersect(), circlesPane, 
			paneForTables, btRedrawCircles);

		btRedrawCircles.setOnAction(e -> {
			redraw();
			pane.getChildren().remove(0);
			pane.getChildren().add(0, intersect());
		});

		circle1.setOnMouseDragged(e -> {
			if (circle1.contains(e.getX(), e.getY())) {
				circle1.setCenterX(e.getX());
				circle1.setCenterY(e.getY());
				tfCircle1CenterX.setText(String.valueOf(e.getX()));
				tfCircle1CenterY.setText(String.valueOf(e.getY()));
			}
			pane.getChildren().remove(0);
			pane.getChildren().add(0, intersect());
		});

		circle2.setOnMouseDragged(e -> {
			if (circle2.contains(e.getX(), e.getY())) {
				circle2.setCenterX(e.getX());
				circle2.setCenterY(e.getY());
				tfCircle2CenterX.setText(String.valueOf(e.getX()));
				tfCircle2CenterY.setText(String.valueOf(e.getY()));
			}
			pane.getChildren().remove(0);
			pane.getChildren().add(0, intersect());
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise16_08");
		primaryStage.setScene(scene);
		primaryStage.show();

		pane.widthProperty().addListener(ov ->
			rectangle.widthProperty().bind(pane.widthProperty())
		);

		pane.heightProperty().addListener(ov ->
			rectangle.heightProperty().bind(pane.heightProperty().multiply(0.5))
		);
	}

	/** Creates a text stating if circles intersect */
	private Text intersect() {
		return new Text("Two circles intersect? " +
			(isIntersect() ? "Yes" : "No"));
	}

	/** Returns true if circles inIntersect */
	private boolean isIntersect() {
		return Math.sqrt(Math.pow(circle1.getCenterX() - circle2.getCenterX(), 2) + 
				 Math.pow(circle1.getCenterY() - circle2.getCenterY(), 2)) 
				 <= circle1.getRadius() + circle2.getRadius();
	}

	/** Retrun a circle */
	private Circle getCircle(double x, double y, double r) {
		Circle circle = new Circle(x, y, r);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		return circle;
	}

	/** Return a table */
	protected VBox getTable(
		TextField centerX, TextField centerY, TextField r, int n) {
		VBox vBox = new VBox(2);
		vBox.setStyle("-fx-border-color: Black");
		vBox.getChildren().addAll(new Label("Enter circle " + 
			n + " info:"), getGrid(centerX, centerY, r));
		return vBox;
	}

	/** Return a grid pane of circle info */
	protected GridPane getGrid(
		TextField centerX, TextField centerY, TextField r) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(2);
		gridPane.add(new Label("Center x:"), 0, 0);
		gridPane.add(centerX, 1, 0);
		gridPane.add(new Label("Center y:"), 0, 1);
		gridPane.add(centerY, 1, 1);
		gridPane.add(new Label("Radius:"), 0, 2);
		gridPane.add(r, 1, 2);
		return  gridPane;
	}

	/** Set text field properties */
	protected void setTextProperties() {
		tfCircle1CenterX.setPrefColumnCount(3);
		tfCircle1CenterY.setPrefColumnCount(3);
		tfCircle1Radius.setPrefColumnCount(3);
		tfCircle2CenterX.setPrefColumnCount(3);
		tfCircle2CenterY.setPrefColumnCount(3);
		tfCircle2Radius.setPrefColumnCount(3);
		tfCircle1CenterX.setText(String.valueOf(circle1.getCenterX()));
		tfCircle1CenterY.setText(String.valueOf(circle1.getCenterY()));
		tfCircle1Radius.setText(String.valueOf(circle1.getRadius()));
		tfCircle2CenterX.setText(String.valueOf(circle2.getCenterX()));
		tfCircle2CenterY.setText(String.valueOf(circle2.getCenterY()));
		tfCircle2Radius.setText(String.valueOf(circle2.getRadius()));
	}

	/** Redraw circles using table information */
	private void redraw() {
		if (Double.parseDouble(tfCircle1CenterX.getText()) 
			!= circle1.getCenterX()) {
			circle1.setCenterX(
				Double.parseDouble(tfCircle1CenterX.getText()));
		}
		if (Double.parseDouble(tfCircle1CenterY.getText()) 
			!= circle1.getCenterY()) {
			circle1.setCenterY(
				Double.parseDouble(tfCircle1CenterY.getText()));
		}
		if (Double.parseDouble(tfCircle2CenterX.getText()) 
			!= circle2.getCenterX()) {
			circle2.setCenterX(
				Double.parseDouble(tfCircle2CenterX.getText()));
		}
		if (Double.parseDouble(tfCircle2CenterY.getText()) 
			!= circle2.getCenterY()) {
			circle2.setCenterY(
				Double.parseDouble(tfCircle2CenterY.getText()));
		}
		if (Double.parseDouble(tfCircle1Radius.getText()) 
			!= circle1.getRadius()) {
			circle1.setRadius(
				Double.parseDouble(tfCircle1Radius.getText()));
		}
		if (Double.parseDouble(tfCircle2Radius.getText()) 
			!= circle2.getRadius()) {
			circle2.setRadius(
				Double.parseDouble(tfCircle2Radius.getText()));
		}
	}

	/** Return a rectangle */
	private Rectangle getRectangle() {
		Rectangle r = new Rectangle(0, 0, 250, 110);
		r.setStroke(Color.WHITE);
		r.setFill(Color.WHITE);
		return r;
	}
}