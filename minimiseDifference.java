import java.util.Arrays;
import java.util.Scanner;

public class minimiseDifference {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of towers: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    System.out.print("Enter the heights of the towers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.print("Enter the value of K: ");
    int k = scanner.nextInt();

    System.out.println("Minimum possible difference: " + getMinDifference(arr, k));
  }

  public static int getMinDifference(int[] arr, int k) {
    int n = arr.length;
    if (n == 1)
      return 0;

    Arrays.sort(arr);
    int minDifference = arr[n - 1] - arr[0];

    for (int i = 1; i < n; i++) {
      if (arr[i] - k < 0)
        continue;

      int smallest = Math.min(arr[0] + k, arr[i] - k);
      int largest = Math.max(arr[n - 1] - k, arr[i - 1] + k);

      minDifference = Math.min(minDifference, largest - smallest);
    }

    return minDifference;
  }
}
