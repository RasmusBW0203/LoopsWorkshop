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

public class Exercise9 extends Application {

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
        double x = 180;

        while (x > 5) {
            double y1 = 200 - x * 0.2;
            double y2 = 200 + x * 0.5;

            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);

            x *= 0.75;
        }
    }
}
