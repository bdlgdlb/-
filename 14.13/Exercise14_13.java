import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class Exercise14_13 extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		double[] scores = {20, 10, 30, 40};

		String[] grades = {"项目", "测试", "期中考试", "期末考试"};

		Text t1 = new Text(110, 80,  grades[0] + " -- " + scores[0] + "%");
		Text t2 = new Text(80, 15,   grades[1] + " -- " + scores[1] + "%");
		Text t3 = new Text(5, 100,   grades[2] + " -- " + scores[2] + "%");
		Text t4 = new Text(100, 180, grades[3] + " -- " + scores[3] + "%");

		Arc arc1 = new Arc(100, 100, 80, 80, 0, 360 * (scores[0] / 100));
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);

		Arc arc2 = new Arc(100, 100, 80, 80, arc1.getStartAngle() + 
			arc1.getLength(), 360 * (scores[1] / 100));
		arc2.setFill(Color.BLUE);
		arc2.setType(ArcType.ROUND);

		Arc arc3 = new Arc(100, 100, 80, 80, arc2.getStartAngle() + 
			arc2.getLength(), 360 * (scores[2] / 100));
		arc3.setFill(Color.GREEN);
		arc3.setType(ArcType.ROUND);

		Arc arc4 = new Arc(100, 100, 80, 80, arc3.getStartAngle() + 
			arc3.getLength(), 360 * (scores[3] / 100));
		arc4.setFill(Color.ORANGE);
		arc4.setType(ArcType.ROUND);
		pane.getChildren().addAll(arc1, arc2, arc3, arc4, t1, t2, t3, t4);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_13");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
}