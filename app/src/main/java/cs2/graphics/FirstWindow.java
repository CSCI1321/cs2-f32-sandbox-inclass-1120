package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class FirstWindow extends Application{
  public void start(Stage stg) {
    Canvas canvas = new Canvas(800,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    g.setFill(Color.ROYALBLUE);
    
    g.strokeRect(200, 100, 400, 200);
   

    g.setLineWidth(10);

    g.strokeText("Hello there class!", 200,100);

    g.setStroke(Color.rgb(200,50,100));
    g.strokeLine(0,0, 800,600);

    //g.fillOval(200, 100, 400, 200);
    g.fillArc(200, 100, 400, 200, 90, 270, ArcType.CHORD);

    double[] xs = {100, 300, 400};
    double[] ys = {300, 50, 300};
    g.setFill(Color.RED);
    g.fillPolygon(xs, ys, 3);


  }
}
