import java.util.Scanner;

public class kadaneAlgorithm {
  static int maxSubarraySum(int[] arr) {
    int res = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = Math.max(max + arr[i], arr[i]);
      res = Math.max(res, max);
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
  }
}
