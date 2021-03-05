/**
 * 
 */
package mainTanda2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tanda2.Cola;


/**
 * @author Rubén Ramírez Rivera
 *
 */
class TestCola {

  private Cola half;
  private Cola full;
  
  @BeforeEach
  void setUp() throws Exception {
    half = new Cola(1,2,3,4,5);
    full = new Cola(1,2,3,4,5,6,7,8,9,10);
  }
  

  /**
   * Test method for {@link tanda2.Cola#push(int)}.
   */
  @Test
  void testPush() {
    System.out.println("TEST PUSH");
    System.out.println(half);
    assertTrue(half.push(6));
    System.out.println(half);
  }

  /**
   * Test method for {@link tanda2.Cola#front()}.
   */
  @Test
  void testFront() {
    System.out.println("TEST FRONT");
    assertEquals(1,half.front());
    System.out.println(half.front());
  }

  /**
   * Test method for {@link tanda2.IntegerList#pop()}.
   */
  @Test
  void testPop() {
    System.out.println("TEST POP");
    System.out.println(full);
    assertEquals(1,full.pop());
    System.out.println(full);
  }

}
