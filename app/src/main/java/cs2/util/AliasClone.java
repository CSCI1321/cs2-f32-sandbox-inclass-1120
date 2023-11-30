package cs2.util;

import java.util.ArrayList;

class Cat {
  public String name;
  public int age;
  public Cat(String n, int a) {
    name = n; age = a;
  }
}
class Thing {
  public double x;
  public Cat c;
  public Thing(double myX, Cat cat) {
    x = myX; c = cat;
  }
  public Object clone() {
    return new Thing(x, new Cat(c.name, c.age));
  }
}
public class AliasClone {
  public static void main(String[] args) {
    ArrayList<Thing> things = new ArrayList<Thing>();
    things.add(new Thing(3.2, new Cat("Tabby", 2)));
    things.add(new Thing(2.5, new Cat("Sally", 6)));
    for(Thing t : things) {
      System.out.print(t.c.name);
      System.out.println();
    }
    
    ArrayList<Thing> alias = things;
    alias.get(0).c.name = "Billy";
    for(Thing t : things) {
      System.out.print(t.c.name);
      System.out.println();
    }

    ArrayList<Thing> clone = (ArrayList<Thing>)things.clone();
    clone.get(0).c.name = "Puppy";
    for(Thing t : things) {
      System.out.print(t.c.name);
      System.out.println();
    }

    ArrayList<Thing> deep = (ArrayList<Thing>)things.clone();
    for(int i=0; i<deep.size(); i++) {
      deep.set(i, (Thing)things.get(i).clone());
    }
    deep.get(0).c.name = "Alice";
    for(Thing t : things) {
      System.out.print(t.c.name);
      System.out.println();
    }




  }
}
