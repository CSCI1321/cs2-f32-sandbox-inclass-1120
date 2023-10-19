package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class ParticleSystem {
  private Vec2 origin;
  private ArrayList<Particle> parts;
  
  public ParticleSystem(Vec2 o) {
    this.origin = o;
    this.parts = new ArrayList<Particle>();
  }

  public void addParticle() {
    for(int i=0; i<1000000; i++) {
      parts.add(new Particle(origin.clone(), new Vec2(Math.random()*10-5, Math.random()*10-5), 10));
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



}
