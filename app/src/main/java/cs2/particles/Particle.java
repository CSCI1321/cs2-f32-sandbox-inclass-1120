package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle implements Displayable {
  protected Vec2 pos, vel;
  protected double sz;
  protected Color col;

  public Particle(Vec2 p, Vec2 v, double s) {
    this.pos = p;
    this.vel = v;
    this.sz = s;
  }

  public void update() {
    this.pos.moveThis(this.vel);
  }

  public void addForce(Vec2 force) {
    this.vel.moveThis(force);
  }

}
