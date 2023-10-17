package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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

    g.setFill(Color.WHITE);
    g.fillRect(0, 0, 800, 600);

    g.setFill(Color.BLACK);
    g.fillRect(300,200, 200,300);
    g.fillOval(300,100, 200,200);
    g.fillOval(300,400, 200,200);

    g.setFill(Color.WHITE);
    g.fillArc(300,100, 200,200, 180,180, ArcType.ROUND);
    g.fillOval(300,150, 100,100);
    g.fillOval(400,150, 100,100);


    //Gradient fill
    g.setStroke(Color.BLACK);
    g.setLineWidth(2);
    for(int i=0; i<canvas.getWidth(); i++) {
      g.setStroke(Color.rgb((int)(i / 800.0 * 255), 0,0));
      g.strokeLine(i,0, i,canvas.getHeight());
    }

    //Recursive fractals
    g.setFill(Color.WHITE);
    g.fillRect(0, 0, 800, 600);
    //drawCircle(g, 400, 300, 150);


    double px = 0;
    double py = 0;
    canvas.setOnMouseDragged( (MouseEvent e) -> {
      g.setStroke(Color.BLACK);
      //g.strokeLine(400,300, e.getX(),e.getY());
      g.strokeLine(px,py, e.getX(),e.getY());
      System.out.println("Dragged!");
    });

    canvas.setOnKeyPressed( (KeyEvent e) -> {
      g.setFill(Color.WHITE);
      g.fillRect(0,0,800,600);
    });
    canvas.requestFocus();



  }

  public static void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.setLineWidth(1);
    g.setStroke(Color.BLACK);
    g.strokeOval(x-r, y-r, r*2,r*2);
    if(r > 0.5) {
      drawCircle(g, x-r,y, r/2);
      drawCircle(g, x+r,y, r/2);
      drawCircle(g, x,y-r, r/2);
      //drawCircle(g, x,y+r, r/2);
    }
  }


}
