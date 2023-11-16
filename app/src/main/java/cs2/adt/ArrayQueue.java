package cs2.adt;

public class ArrayQueue<T> implements Queue<T> {
  private T[] arr;
  private int len;
  private int beg;

  public ArrayQueue() {
    arr = (T[]) new Object[10];
    len = 0;
    beg = 0;
  }

  public void enqueue(T item) {
    arr[beg + len] = item;
    len++;
  }
  public T dequeue() {
    T retVal = arr[beg];
    beg++;
    len--;
    return retVal;
  }
  public T peek() {
    return arr[beg];
  }
  public boolean isEmpty() { return len == 0; }
}
