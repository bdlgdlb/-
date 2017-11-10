import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
public class Exercise15_03 extends Application {
	private BallPane ballPane = new BallPane();
	@Override
	public void start(Stage primaryStage) {
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");

		hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
		btLeft.setOnAction(e -> ballPane.left());
		btRight.setOnAction(e -> ballPane.right());
		btUp.setOnAction(e -> ballPane.up());
		btDown.setOnAction(e -> ballPane.down());

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(0, 10, 5, 10));
		pane.setCenter(ballPane);
		pane.setBottom(hBox);

		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise15_03");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}