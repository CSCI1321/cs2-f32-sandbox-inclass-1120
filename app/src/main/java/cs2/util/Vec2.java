package cs2.util;

public class Vec2 {
  private double x, y;
  public Vec2 (double myX, double myY) {
    this.x = myX;
    this.y = myY;
  }
  public Vec2 () {
    this.x = 0;
    this.y = 0;
  }

  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }

  public double getX() { return this.x; }
  public double getY() { return this.y; }
  
  public void moveTo(double newx, double newy) {
    this.x = newx;
    this.y = newy;
  }

  public void moveThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }
  public void moveThis(double dx, double dy) {
    this.x += dx;
    this.y += dy;
  }
  public void multThis(double amtX, double amtY) {
    this.x *= amtX;
    this.y *= amtY;
  }


}
