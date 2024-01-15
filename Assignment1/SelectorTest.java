import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests for Selector Class.
 */
 
public class SelectorTest {

/** Test case for the min method. */
   @Test
   public void testMin1() {
      int[] a = {1, 2, -5, 7, 8};
      int expected = -5;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

/** Test 000 */
   @Test
   public void testMin2() {
      int[] a = {1, 1, 1, 1};

   
      int expected = 1;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 001 */
   @Test
   public void testMin3() {
      int[] a = {1, 1, 1, -5};
   
      int expected = -5;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 010 */
   @Test
   public void testMin4() {
      int[] a = {1, 1, -5, 1, 1};
   
      int expected = -5;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 011 */
   @Test
   public void testMin5() {
      int[] a = {1, 1, 1, 0};
   
      int expected = 0;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 100 */
   @Test
   public void testMin6() {
      int[] a = {1, -1, -1};

      int expected = -1;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 101 */
   @Test
   public void testMin7() {
      int[] a = {1, 0, 10};
   
      int expected = 0;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   /** Test 110 */
   @Test
   public void testMin8() {
      int[] a = {1, 1, -5};

      int expected = -5;
      int actual = Selector.min(a);
      assertEquals(expected, actual);
   }

   @Test (expected = IllegalArgumentException.class)
   public void throwsException() {
      int[] a = null;
      int[] b = {};

      Exception expected = new IllegalArgumentException();
      int actual = Selector.min(a);
      assertEquals(expected, actual);

      int actual2 = Selector.min(b);
      assertEquals(expected, actual2);
   }

   /** Test case for the max method. */
   @Test
   public void testMax1() {
      int[] a = {1, 2, -5, 7, 8};
      int expected = 8;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

/** Test 000 */
   @Test
   public void testMax() {
      int[] a = {1, 1, 1, 1};

   
      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 001 */
   @Test
   public void testMax4() {
      int[] a = {1, 1, 1, -5};
   
      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 010 */
   @Test
   public void testMax5() {
      int[] a = {1, 1, -5, 1, 1};
   
      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 011 */
   @Test
   public void testMax6() {
      int[] a = {1, 1, 1, 0};
   
      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 100 */
   @Test
   public void testMax7() {
      int[] a = {1, -1, -1};

      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 101 */
   @Test
   public void testMax8() {
      int[] a = {1, 0, 10};
   
      int expected = 10;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   /** Test 110 */
   @Test
   public void testMin9() {
      int[] a = {1, 1, -5};

      int expected = 1;
      int actual = Selector.max(a);
      assertEquals(expected, actual);
   }

   @Test (expected = IllegalArgumentException.class)
   public void throwsException2() {
      int[] a = null;
      int[] b = {};

      Exception expected = new IllegalArgumentException();
      int actual = Selector.max(a);
      assertEquals(expected, actual);

      int actual2 = Selector.max(b);
      assertEquals(expected, actual2);
   }

   @Test
   public void testCeiling1() {
      int[] a = {-2, 10, 15, 3, 19, 9 , 8, 5};

      int expected = 8;
      int actual = Selector.ceiling(a, 7);
      assertEquals(expected, actual);
   }

   @Test
   public void testCeiling2() {
      int[] a = {2, 8, 7, 3, 4};

      int expected = 2;
      int actual = Selector.ceiling(a, 1);
      assertEquals(expected, actual);
   }

   @Test
   public void testCeiling3() {
      int[] a = {5, 9, 1, 7, 3};

      int expected = 7;
      int actual = Selector.ceiling(a, 7);
      assertEquals(expected, actual);
   }

   @Test
   public void testCeiling4() {
      int[] a = {8, 7, 6, 5, 4};

      int expected = 4;
      int actual = Selector.ceiling(a, 0);
      assertEquals(expected, actual);
   }

   @Test
   public void testCeiling5() {
      int[] a = {8, 2, 8, 7, 3, 3, 4};

      int expected = 7;
      int actual = Selector.ceiling(a, 5);
      assertEquals(expected, actual);
   }

   @Test
   public void testFloor1() {
      int[] a = {2, 8, 7, 3, 4};

      int expected = 4;
      int actual = Selector.floor(a, 6);
      assertEquals(expected, actual);
   }

   @Test
   public void testFloor2() {
      int[] a = {5, 9, 1, 7, 3};

      int expected = 1;
      int actual = Selector.floor(a, 1);
      assertEquals(expected, actual);
   }

   @Test
   public void testFloor3() {
      int[] a = {8, 7, 6, 5, 4};

      int expected = 8;
      int actual = Selector.floor(a, 9);
      assertEquals(expected, actual);
   }

   @Test
   public void testFloor4() {
      int[] a = {8, 2, 8, 7, 3, 3, 4};

      int expected = 4;
      int actual = Selector.floor(a, 5);
      assertEquals(expected, actual);
   }
}
