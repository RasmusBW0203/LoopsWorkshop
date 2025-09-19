package Opgaver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise1 extends Application {

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
// draw an arrowhead at (50,30)
        int x = 100;
        int y = 125;
        Line line1 = new Line(x, y, x + 40, y - 16);
        Line line2 = new Line(x, y, x + 40, y + 16);
        line1.setStrokeWidth(5);
        line2.setStrokeWidth(5);

        pane.getChildren().addAll(line1, line2);
// draw an arrowhead at (25,140)
        x = 100;
        y = 75;
        Line line3 = new Line(x, y, x + 40, y - 16);
        Line line4 = new Line(x, y, x + 40, y + 16);
        line3.setStrokeWidth(5);
        line4.setStrokeWidth(5);
        pane.getChildren().addAll(line3, line4);

        x = 100;
        y = 25;
        Line line5 = new Line(x, y, x + 40, y - 16);
        Line line6 = new Line(x, y, x + 40, y + 16);
        line5.setStrokeWidth(5);
        line6.setStrokeWidth(5);
        pane.getChildren().addAll(line5, line6);

    }
}

