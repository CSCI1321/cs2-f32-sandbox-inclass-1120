package cs2.adt;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      data = d;
      next = n;
    }
  }

  private Node head;

  public LinkedStack() {
    head = null;
  }

  public void push(T elem) {
    head = new Node(elem, head);
  }
  public T pop() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    T tmp = head.data;
    head = head.next;
    return tmp;

  }
  public T peek() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    return head.data;
  }
  public boolean isEmpty() {
    return head == null;
  }
  
}
