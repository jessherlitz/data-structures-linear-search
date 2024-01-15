public class LinearSearch {

  public static void main(String[] args) {

    System.out.println(min(-1,2,3));
    System.out.println(min(-3,2,1));
    System.out.println(min(3,3,1));
    System.out.println(min(1,-3,1));
    System.out.println(min(2,2,3)); // BUG

    String s1 = "A";
    String s2 = "F";

    int cmp = s1.compareTo(s2);

    System.out.println(cmp);

    int[] array = {1,2,3,4,6,2,100,0};

    
    System.out.println("Num of negatives: " + numOfNegatives(array));
    System.out.println("Min: " + findMin(array));
    System.out.println("SEARCH: " + search(array,5));

  }
   
    public static int min(int a, int b, int c) {
      if ((a < b) && (a < c)) {
        return a;
      }
      if ((b < a) && (b < c)) {
        return b;
      }
      return c;
    }


    /** 
    *  initialize a counter called negativeCount to 0
       for each element in the array {
          if the current element is less than zero {
            add one to negativeCount
        }
      }
      return negativeCount 
    *
    */

    public static int numOfNegatives(int[] arr) {
      int negativeCount = 0;

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
          negativeCount++;
        }
      }

      return negativeCount;
    }


    public static int findMin(int[] arr) {
      int min = 0;

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
      }

      return min;
    }

    public static int search(int[] a, int target) {
      int i = 0;
      while ((a[i] != target) && (i < a.length)) {
          i++;
      }
      if (a[i] == target) {
          return i;
      }
      else {
          return -1;
      }
  }
}
