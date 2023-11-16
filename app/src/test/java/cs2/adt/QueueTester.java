package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  public void init() {
    q = Queue.create();
  }

  @Test
  public void testSingleEnDeQ() {
    assertTrue(q.isEmpty());
    q.enqueue(5);
    assertFalse(q.isEmpty());
    assertEquals(q.peek(), 5);
    assertEquals(q.dequeue(), 5);
    assertTrue(q.isEmpty());
  }

  @Test
  public void testMultiEnDeQ() {
    assertTrue(q.isEmpty());
    for(int i=0; i<1000; i++) {
      q.enqueue(i);
      assertTrue(q.peek() == 0);
      assertFalse(q.isEmpty());
    }
    for(int i=0; i<1000; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }

  /*
  @Test
  public void testException() {
    assertTrue(stk.isEmpty());
    try {
      stk.pop();
      fail("pop() from emtpy stack didn't except");
    }
    catch (EmptyStackException e) {
      assertTrue(true);
    }
    stk.push(1);
    try {
      stk.pop();
    }
    catch (EmptyStackException e) {
      //assertTrue(false);
      fail("pop() caused exception on a non-empty stack");
    }
  }
  */
}
