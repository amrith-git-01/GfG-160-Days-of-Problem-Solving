import java.util.Scanner;

class ReverseArray {

  public void reverseArray(int arr[]) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ReverseArray obj = new ReverseArray();
    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    obj.reverseArray(arr);
    System.out.println("Reversed array:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    scanner.close();
  }
}
