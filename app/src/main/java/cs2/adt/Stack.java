package cs2.adt;

import java.util.EmptyStackException;

public interface Stack<T> {
  public void push(T elem);
  public T pop() throws EmptyStackException;
  public T peek() throws EmptyStackException;
  public boolean isEmpty();

  public static <T> Stack<T> create() {
    return new ArrayStack<T>();
  }
}
