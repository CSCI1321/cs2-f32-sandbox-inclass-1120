package cs2.adt;

public class LinkedQueue<T> implements Queue<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      data = d;
      next = n;
    }
  }

  private Node head;
  private Node tail;

  public LinkedQueue() {
    head = null;
    tail = null;
  }

  public void enqueue(T item);
  public T dequeue();
  public T peek();
  public boolean isEmpty();

}
