import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Histogram extends Pane {
	double w = 400;
    double h = 200;
    
    Integer[] counts = new Integer[26];
    
    public Histogram() {
    }
    
    public void setCounts(int[] counts) {
      for (int i = 0; i < counts.length; i++) {
        this.counts[i] = counts[i];
      }
      
      repaint();
    }
    
    private void repaint() {
      getChildren().clear();
      
      Line line = new Line(10, h + 10 - 20, w - 10, h + 10 - 20);      
      getChildren().addAll(line);
 
      int maxCounts = java.util.Collections.max(new ArrayList<>(Arrays.asList(counts)));            
      for (int i = 0; i < 26; i++) {
        if (maxCounts > 0) {
          Rectangle r = new Rectangle(10 + i * (w - 20) / 26, h + 10 - 20 - counts[i] * (h - 20) / maxCounts, 
            (w - 20) / 26 - 3, counts[i] * (h - 20) / maxCounts);
          r.setFill(Color.WHITE);
          r.setStroke(Color.BLACK);
          getChildren().add(r);
        }
        getChildren().add(new Text(10 + i * (w - 20) / 26, h - 5 + 10, (char)(i + 'A') + ""));
      }
    }
}