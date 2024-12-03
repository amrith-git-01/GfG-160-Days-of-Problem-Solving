import java.util.Arrays;

public class nextPermutation {
  public void nextPermutation(int[] arr) {
    int len = arr.length;
    int i = len - 2;
    while (i >= 0 && arr[i] >= arr[i + 1]) {
      i--;
    }
    if (i >= 0) {
      int j = len - 1;
      while (arr[j] <= arr[i]) {
        j--;
      }
      swap(arr, i, j);
    }
    reverse(arr, i + 1, len - 1);
  }

  private void reverse(int[] arr, int start, int end) {
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    nextPermutation solution = new nextPermutation();
    int[] arr1 = { 2, 4, 1, 7, 5, 0 };
    solution.nextPermutation(arr1);
    System.out.println(Arrays.toString(arr1));

    int[] arr2 = { 3, 2, 1 };
    solution.nextPermutation(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = { 3, 4, 2, 5, 1 };
    solution.nextPermutation(arr3);
    System.out.println(Arrays.toString(arr3));
  }
}
