package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  private Vec2 pos, vel;
  private double sz;

  public Particle(Vec2 p, Vec2 v, double s){
    this.pos = p;
    this.vel = v;
    this.sz = s;
  }

  public void display(GraphicsContext g) {
    g.setFill(Color.rgb(200,50,120, 0.1));
    g.fillOval(pos.getX(), pos.getY(), sz, sz);
  }

  public void update() {
    this.pos.moveThis(this.vel);
  }
}
