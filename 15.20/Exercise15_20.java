import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Exercise15_20 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Circle p1 = new Circle(50, 100, 5);
		Circle p2 = new Circle(100, 25, 5);
		Circle p3 = new Circle(150, 80, 5);
		ArrayList<Circle> points = new ArrayList<>();
		points.add(p1);
		points.add(p2);
		points.add(p3);

		drawTriangle(pane, points);
		pane.getChildren().addAll(p1, p2, p3);
		placeText(pane, points);

		pane.setOnMouseDragged(e -> {
			for (int i = 0; i < points.size(); i++) {
				if (points.get(i).contains(e.getX(), e.getY())) {
					pane.getChildren().clear();
					points.get(i).setCenterX(e.getX());
					points.get(i).setCenterY(e.getY());
					drawTriangle(pane, points);
					pane.getChildren().addAll(p1, p2, p3);
					placeText(pane, points);
				}
			}
		});	

		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise15_20");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void placeText(Pane pane, ArrayList<Circle> p) {
		double[] sides = getSides(p);
		double[] angles = getAngles(sides);
		pane.getChildren().add(new Text(p.get(0).getCenterX(),
			p.get(0).getCenterY() - 5, String.format("%.2f", angles[1])));
		pane.getChildren().add(new Text(p.get(1).getCenterX(), 
			p.get(1).getCenterY() - 5, String.format("%.2f", angles[2])));
		pane.getChildren().add(new Text(p.get(2).getCenterX(),
			p.get(2).getCenterY() - 5, String.format("%.2f", angles[0])));
	}


	private double[] getSides(ArrayList<Circle> p) {
		double[] sides = new double[3];
		sides[0] = Math.sqrt(Math.pow(p.get(0).getCenterX() - 
			p.get(1).getCenterX(), 2) + Math.pow(p.get(0).getCenterY() - 
			p.get(1).getCenterY(), 2));
		sides[1] = Math.sqrt(Math.pow(p.get(1).getCenterX() - 
			p.get(2).getCenterX(), 2) + Math.pow(p.get(1).getCenterY() - 
			p.get(2).getCenterY(), 2));
		sides[2] = Math.sqrt(Math.pow(p.get(2).getCenterX() - 
			p.get(0).getCenterX(), 2) + Math.pow(p.get(2).getCenterY() - 
			p.get(0).getCenterY(), 2));
		return sides;
	}

	private double[] getAngles(double[] s) {
		double[] angles = new double[3];
		angles[0] = Math.toDegrees(Math.acos((s[0] * s[0] - s[1] * 
			s[1] - s[2] * s[2]) / (-2 * s[1] * s[2])));
		angles[1] = Math.toDegrees(Math.acos((s[1] * s[1] - s[0] * 
			s[0] - s[2] * s[2]) / (-2 * s[0] * s[2])));
		angles[2] = Math.toDegrees(Math.acos((s[2] * s[2] - s[1] * 
			s[1] - s[0] * s[0]) / (-2 * s[0] * s[1])));
		return angles;
	}

	private void drawTriangle(Pane pane, ArrayList<Circle> p) {
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		ObservableList<Double> points = polygon.getPoints();
		for (int i = 0; i < p.size(); i++) {
			points.add(p.get(i).getCenterX());
			points.add(p.get(i).getCenterY());
		}
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
	}
}