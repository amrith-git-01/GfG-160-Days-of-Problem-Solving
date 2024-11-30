import java.util.Scanner;

public class zerosToEnd {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int n = scanner.nextInt();

    if (n <= 0) {
      System.out.println("Array size must be greater than zero.");
      return;
    }

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    Solution solution = new Solution();
    solution.pushZerosToEnd(arr);

    System.out.println("Array after pushing zeros to the end:");
    for (int num : arr) {
      System.out.print(num + " ");
    }

    scanner.close();
  }
}

class Solution {
  void pushZerosToEnd(int[] arr) {
    int len = arr.length;
    int[] temp = new int[len];
    int index = 0;

    for (int i = 0; i < len; i++) {
      if (arr[i] != 0) {
        temp[index++] = arr[i];
      }
    }

    while (index < len) {
      temp[index++] = 0;
    }

    for (int i = 0; i < len; i++) {
      arr[i] = temp[i];
    }
  }
}
