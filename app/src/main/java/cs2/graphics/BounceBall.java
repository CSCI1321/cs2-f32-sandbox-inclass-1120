package cs2.graphics;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
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

public class BounceBall extends Application{
  public void start(Stage stg) {
    stg.setTitle("Bounce Ball!");
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    Vec2 pos = new Vec2(200,200);
    Vec2 vel = new Vec2(2,3);

    AnimationTimer timer = new AnimationTimer() {
      double x = 200;
      double y = 200;
      double spdX = 2;
      double spdY = 3;
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, canvas.getWidth(), canvas.getHeight());

        g.setFill(Color.CRIMSON);
        g.fillOval(pos.getX(),pos.getY(), 50,50);
        pos.moveThis(vel);


        /*
        x += spdX;
        y += spdY;
        if(x + 50 > canvas.getWidth() || x < 0) {
          spdX *= -1;
        }
        if(y + 50 > canvas.getHeight() || y < 0) {
          spdY *= -1;
        }
        //y += 1;
        */
      }
    };
    timer.start();



  }
}
