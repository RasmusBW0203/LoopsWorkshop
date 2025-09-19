package Opgaver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Exercise6 extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Opg1"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(300, 300); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        int x1 = 10;
        int y1 = 200;
        int x2 = 275;
        int y2 = 200;
        Line line = new Line(x1, y1, x2, y2);
        pane.getChildren().add(line);

        for (int i = 0; i < 11; i++) {
            int x = 15 + i * 25;
            int y3 = 205;
            int y4 = 195;
            if (i == 0 || i == 5 || i == 10) {
                y3 += 5;
                y4 -= 5;
            }
            Line line1 = new Line(x, y3, x, y4);
            pane.getChildren().add(line1);
        }
    }
}

