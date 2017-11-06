import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import java.util.Scanner;

public class Exercise14_24 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Scanner input = new Scanner(System.in);

		Pane pane = new Pane();

		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		pane.getChildren().add(polygon);
		ObservableList<Double> list = polygon.getPoints();

		System.out.print("Enter five points: ");
		for (int i = 0; i < 8; i++) {
			list.add(input.nextDouble());
		}
		double x = input.nextDouble();
		double y = input.nextDouble();

		Circle circle = new Circle(x, y, 5);
		pane.getChildren().add(circle);

		Text text = new Text("        The point is " + 
			(polygon.contains(x, y) ? "" : "not ") + "inside the polygon  ");

		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(pane, text);

		Scene scene = new Scene(vbox);
		primaryStage.setTitle("Exercise14_24");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}