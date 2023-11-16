package cs2.adt;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StackTester {
  private Stack<Integer> stk;

  @BeforeEach
  public void init() {
    stk = Stack.create();
  }

  @Test
  public void testSinglePushPop() {
    assertTrue(stk.isEmpty());
    stk.push(5);
    assertFalse(stk.isEmpty());
    assertEquals(stk.peek(), 5);
    assertEquals(stk.pop(), 5);
    assertTrue(stk.isEmpty());
  }

  @Test
  public void testMultiPushPop() {
    assertTrue(stk.isEmpty());
    for(int i=0; i<1000; i++) {
      stk.push(i);
      assertTrue(stk.peek() == i);
      assertFalse(stk.isEmpty());
    }
    for(int i=999; i>=0; i--) {
      assertEquals(stk.peek(), i);
      assertEquals(stk.pop(), i);
    }
    assertTrue(stk.isEmpty());
  }

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

}
