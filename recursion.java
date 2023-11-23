public class recursion {

  public static void main(String[] args) {
    // Testing Fibonacci
    int fibonacciResult = fibonacci(6);
    System.out.println("Fibonacci Result: " + fibonacciResult);

    // Testing Power
    double powerResult = power(2, 3);
    System.out.println("Power Result: " + powerResult);

    // Testing Reverse String
    String reversedString = reverseString("Hello");
    System.out.println("Reversed String: " + reversedString);

    // Testing Palindrome
    boolean isPalindrome = palindrome("radar");
    System.out.println("Is Palindrome: " + isPalindrome);

    // Testing Count Down
    countDown(5);

    // Testing Binary Search (Assuming a sorted array)
    int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int binarySearchResult = binarySearch(sortedArray, 6, 0, sortedArray.length - 1);
    System.out.println("Binary Search Result: " + binarySearchResult);

    // Add tests for other functions here...

  }

  // a. Fibonacci
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // b. Power
  public static double power(double x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * power(x, n - 1);
  }

  // c. Reverse String
  public static String reverseString(String str) {
    if (str.isEmpty()) {
      return str;
    }
    return reverseString(str.substring(1)) + str.charAt(0);
  }

  // d. Palindrome
  public static boolean palindrome(String str) {
    if (str.length() <= 1) {
      return true;
    }
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
      return false;
    }
    return palindrome(str.substring(1, str.length() - 1));
  }

  // e. Count Down
  public static void countDown(int n) {
    if (n <= 0) {
      System.out.println("Countdown complete!");
    } else {
      System.out.println(n);
      countDown(n - 1);
    }
  }

  // f. Binary Search
  public static int binarySearch(int[] arr, int target, int low, int high) {
    if (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        return binarySearch(arr, target, mid + 1, high);
      } else {
        return binarySearch(arr, target, low, mid - 1);
      }
    }

    return -1; // Element not found
  }
}
