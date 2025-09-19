package Opgaver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise3 extends Application {

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
        pane.setPrefSize(500, 500); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        int x1 = 100;
        int y1 = 50;
        int x2 = 120;
        int y2 = 50;
        while (y2 <= 250) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            y2 += 50;
            y1 += 50;
            x1 -= 20;
            x2 += 20;
        }
    }
}
