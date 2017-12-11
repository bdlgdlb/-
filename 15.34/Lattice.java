import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Lattice extends Pane {
	 public static final int N = 16;
    private Point[][] lattice = new Point[N + 1][N + 1];
    private double paneWidth = 300;
  	private double paneHeight = 250;
    private double hGap = paneWidth / N;
    private double vGap = paneHeight / N;
      
    public Lattice() {
      drawLines();
    }

    /** Draw lines */
    public void drawLines() {
      // Draw lattice lines
      for (int i = 1; i < N + 1; i++) {
        Line line1 = new Line(0, i * vGap, paneWidth, i * vGap);
        Line line2 = new Line(i * hGap, 0, i * hGap, paneHeight);
        this.getChildren().addAll(line1, line2);
        line1.setStroke(Color.LIGHTGRAY);
        line2.setStroke(Color.LIGHTGRAY);
      }
    }
    
    /** Draw a path */
    public void drawPath() {
      getChildren().clear();      
      drawLines();
      
      // Start from the center point in the lattice (i, j)
      int i = (N + 1) / 2;
      int j = (N + 1) / 2;
            
      while (lattice[i][j] != null) {
        Point p = lattice[i][j];
        Line line = new Line(i * hGap, j * vGap, p.x * hGap, p.y * vGap);
        getChildren().add(line);
        i = p.x;
        j = p.y;
      }
    }

    public void getAPath() {
      // Refresh lattice
      for (int i = 0; i < lattice.length; i++) {
        for (int j = 0; j < lattice.length; j++) {
          lattice[i][j] = null;
        }
      }

      // (i, j) is the current path point. Initially it is at the center
      int i = (N + 1) / 2;
      int j = (N + 1) / 2;

      while (i > 0 && i < N && j > 0 && j < N) {
        if (lattice[i - 1][j] != null && lattice[i + 1][j] != null
                && lattice[i][j - 1] != null && lattice[i][j + 1] != null) {
          break; // Dead end
        }

        double r = Math.random();
        if (r < .25 && lattice[i][j + 1] == null) {
          lattice[i][j] = new Point(i, j + 1); // Right
          j++;
        } else if (r < .50 && lattice[i + 1][j] == null) {
          lattice[i][j] = new Point(i + 1, j); // Down
          i++;
        } else if (r < .75 && lattice[i][j - 1] == null) {
          lattice[i][j] = new Point(i, j - 1); // Left
          j--;
        } else if (r < 1.00 && lattice[i - 1][j] == null) {
          lattice[i][j] = new Point(i - 1, j); // Up
          i--;
        }
      }
      
      drawPath();
    }

    class Point {
      int x;
      int y;
      
      Point(int i, int j) {
        this.x = i; this.y = j;
      }
    }
}