package cs2.generics;

public class Sorting {
  
  public static void bubbleSort(int[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i] > a[i+1]) { //Need to swap?
          int tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] x = new int[10];
    for(int i=0; i<x.length; i++) {
      x[i] = (int)(Math.random() * 100);
    }
    for(int a : x) { System.out.print(a + ","); }
    System.out.println();
    bubbleSort(x);
    for(int a : x) { System.out.print(a + ","); }
    System.out.println();

    double[] y = new double[10];
    for(int i=0; i<x.length; i++) {
      x[i] = (int)(Math.random() * 100);
    }
  }


}
