package cs2.particles;

import java.io.File;
import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ParticleApp extends Application {
  public void start(Stage stg) {
    stg.setTitle("Particles!");
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();
    GraphicsContext g = canvas.getGraphicsContext2D();

    ArrayList<ParticleSystem> lst = new ArrayList<ParticleSystem>();
    //ParticleSystem ps = new ParticleSystem(new Vec2(300,200));

    canvas.setOnMouseClicked((MouseEvent e) -> {
      lst.add(new ParticleSystem(new Vec2(e.getX(), e.getY())));
    });

    canvas.setOnKeyTyped((KeyEvent e) -> {
      System.out.println("Pressed:" + e.getCode());
      if(e.getCharacter().equals(" ")) {
        lst.clear();
      }
    });
    canvas.requestFocus();

    Image starImg = new Image("file:star.png");
    Image smokeImg = new Image("file:smoke.png");
  
    System.out.println(starImg.getHeight());

    Vec2 gravity = new Vec2(0, 1);
    Vec2 wind = new Vec2();

    canvas.setOnMouseMoved((MouseEvent e) -> {
      wind.moveTo(e.getX() / canvas.getWidth() * 10 - 5, 0);
    });


    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0,600,600);

        //g.drawImage(img, 0, 0, 40, 100);

        for(ParticleSystem ps : lst) {
          ps.display(g);
          ps.update();
          //ps.addParticle();
          ps.addParticle(starImg);
          ps.addForce(gravity);
          ps.addForce(wind);
        }
      }
    };
    timer.start();

  }
}
