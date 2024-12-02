import java.util.Scanner;
import java.util.Arrays;

class rotateArray {
  static void rotateArr(int arr[], int d) {
    int len = arr.length;
    d %= len;
    int[] array = new int[len];
    for (int i = 0; i < len - d; i++) {
      array[i] = arr[d + i];
    }
    for (int i = 0; i < d; i++) {
      array[len - d + i] = arr[i];
    }
    for (int i = 0; i < len; i++) {
      arr[i] = array[i];
    }
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

    System.out.print("Enter the number of rotations: ");
    int d = scanner.nextInt();

    System.out.println("Original Array: " + Arrays.toString(arr));

    rotateArr(arr, d);

    System.out.println("Rotated Array: " + Arrays.toString(arr));

    scanner.close();
  }
}
