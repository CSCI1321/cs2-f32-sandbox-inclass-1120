package cs2.util;

import java.util.HashSet;
import java.util.Iterator;

public class SetStuff {
  public static void main(String[] args) {
    HashSet<String> s = new HashSet<String>();
    s.add("Hello");
    s.add("Goodbye");
    s.add("What?");
    s.add("Goodbye");
    System.out.println(s);
    System.out.println(s.size());
    s.remove("What?");
    System.out.println(s);
    System.out.println(s.size());
    System.out.println(s.contains("Hello"));
    System.out.println(s.contains("What?"));
    HashSet<String> t = new HashSet<String>();
    t.add("Hello");
    t.add("You");
    t.add("There");
    System.out.println("t=" + t);

    s.addAll(t);
    System.out.println(s);
    s.removeAll(t);
    System.out.println(s);
    s.add("You");
    System.out.println("s="+s);
    System.out.println("t="+t);
    s.retainAll(t);
    System.out.println(s);

    Iterator<String> it = t.iterator();
    HashSet<String> u = new HashSet<String>(); 
    while(it.hasNext()) {
      //System.out.println(it.next());
      u.add(it.next().toUpperCase());
    }
    System.out.println(u);


    
  }
}
