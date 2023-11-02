package cs2.generics;

import java.util.ArrayList;

public class GenericStuff {
  
  public static ArrayList<Integer> arrayToList(int[] a) {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    for(int i=0; i<a.length; i++) {
      lst.add(a[i]);
    }
    return lst;
  }

  public static <E> ArrayList<E> arrayToList(E[] a) {
    ArrayList<E> lst = new ArrayList<E>();
    for(int i=0; i<a.length; i++) {
      lst.add(a[i]);
    }
    return lst;
  }


  public static void main(String[] args) {
    int[] x = {1,2,3,4,5};
    System.out.println(x);
    System.out.println(arrayToList(x));
    Double[] y = {1.2, 4.5, 2.3};
    System.out.println(arrayToList(y));
    Boolean[] b = {true, false, false, true};
    System.out.println(arrayToList(b));
  }


}
