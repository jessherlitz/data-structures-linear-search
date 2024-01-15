import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * MinOfThreeTest.java
 * Illustrates JUnit tests for the MinOfThreeTest class.
 */


public class MinOfThreeTest {


   /////////////////////
   // Tests for min1 //
   ////////////////////

   // Min 0, Max 1

   /** Test 000 */
   @Test
   public void testMin1One() {
      int a = 1;
      int b = 1;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 001 */
   @Test
   public void testMin1Two() {
      int a = 1;
      int b = 1;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 010 */
   @Test
   public void testMin1Three() {
      int a = 1;
      int b = 2;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 011 */
   @Test
   public void testMin1Fourth() {
      int a = 1;
      int b = 2;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 100 */
   @Test
   public void testMin1Fifth() {
      int a = 2;
      int b = 1;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 101 */
   @Test
   public void testMin1Sixth() {
      int a = 2;
      int b = 1;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 110 */
   @Test
   public void testMin1Seventh() {
      int a = 2;
      int b = 2;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(expected, actual);
   }

   /////////////////////
   // Tests for min2 //
   //////////////////// 

   /** Test 000 */
   @Test
   public void testMin2One() {
      int a = 1;
      int b = 1;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 001 */
   @Test
   public void testMin2Two() {
      int a = 1;
      int b = 1;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 010 */
   @Test
   public void testMin2Three() {
      int a = 1;
      int b = 2;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 011 */
   @Test
   public void testMin2Fourth() {
      int a = 1;
      int b = 2;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 100 */
   @Test
   public void testMin2Fifth() {
      int a = 2;
      int b = 1;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 101 */
   @Test
   public void testMin2Sixth() {
      int a = 2;
      int b = 1;
      int c = 2;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }

   /** Test 110 */
   @Test
   public void testMin2Seventh() {
      int a = 2;
      int b = 2;
      int c = 1;

      int expected = 1;
      int actual = MinOfThree.min2(a, b, c);
      assertEquals(expected, actual);
   }


}
