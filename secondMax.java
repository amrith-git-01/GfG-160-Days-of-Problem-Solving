import java.util.Scanner;

public class secondMax {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = scanner.nextInt();

    if (n < 2) {
      System.out.println("Array should have at least two elements.");
      return;
    }

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    Solution solution = new Solution();
    int result = solution.getSecondLargest(arr);

    if (result == -1) {
      System.out.println("No second largest element found.");
    } else {
      System.out.println("The second largest element is: " + result);
    }

    scanner.close();
  }
}

class Solution {
  public int getSecondLargest(int[] arr) {
    int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }
    return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
  }
}
