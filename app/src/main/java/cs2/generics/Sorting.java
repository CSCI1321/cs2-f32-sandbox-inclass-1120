package cs2.generics;

public class Sorting {
  
  public static <T extends Comparable<T>> void bubbleSort(T[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i].compareTo(a[i+1]) > 0) { //Need to swap?
          T tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void selectionSort(int[] a) {
    for(int j=0; j<a.length; j++) {
      int minIdx = j;
      for(int i=j+1; i<a.length; i++) {
        if(a[i] < a[minIdx]) { minIdx = i; }
      }
      //Swap smallest to the front
      int tmp = a[j];
      a[j] = a[minIdx];
      a[minIdx] = tmp;
    }
  }
  public static void insertionSort(int[] a) {
    for(int j=1; j<a.length; j++) {
      int tmp = a[j];
      int i = j-1;
      while(i >= 0 && a[i] > tmp) {
        a[i+1] = a[i];
        i--;
      }
      a[i+1] = tmp;
    }
  }
  public static void main(String[] args) {
    Double[] x = new Double[10];
    for(int i=0; i<x.length; i++) {
      x[i] = (Math.random() * 100);
    }
    for(double a : x) { System.out.print(a + ","); }
    System.out.println();
    //insertionSort(x);
    //selectionSort(x);
    bubbleSort(x);
    for(double a : x) { System.out.print(a + ","); }
    System.out.println();

    double[] y = new double[10];
    for(int i=0; i<x.length; i++) {
      x[i] = (Math.random() * 100);
    }
  }


}
