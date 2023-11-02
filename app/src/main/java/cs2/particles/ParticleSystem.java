package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ParticleSystem {
  private Vec2 origin;
  private ArrayList<Particle> parts;

  public ParticleSystem(Vec2 o) {
    this.origin = o;
    this.parts = new ArrayList<Particle>();
  }

  public void addParticle(Image img) {
    parts.add(0, new ImageParticle(img, origin.clone(), new Vec2(Math.random()*10-5,-Math.random()*10)));
  }

  public void addParticle() {
    if(Math.random() < 0.5) {
      parts.add(new RainbowParticle(origin.clone(), new Vec2(Math.random()*10-5, Math.random()*10-5)));
    } else {
      parts.add(new RoundParticle(origin.clone(), new Vec2(Math.random()*10-5, Math.random()*10-5), 10));
    }
  }

  public void display(GraphicsContext g) {
    for(Particle p : parts) {
      p.display(g);
    }
  }
  public void update() {
    for(Particle p : parts) {
      p.update();
    }
  }
  public void addForce(Vec2 force) {
    for(Particle p : parts) {
      p.addForce(force);
    }
  }



}
