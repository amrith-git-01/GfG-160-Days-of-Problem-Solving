import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MajorityElement {
  public List<Integer> findMajority(int[] nums) {
    int len = nums.length;
    int count;
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      if (nums[i] != Integer.MIN_VALUE) {
        count = 1;
        for (int j = i + 1; j < len; j++) {
          if (nums[i] == nums[j]) {
            nums[j] = Integer.MIN_VALUE;
            count++;
          }
        }
        if (count > len / 3) {
          list.add(nums[i]);
        }
      }
    }
    Collections.sort(list);
    return list;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = scanner.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    MajorityElement majorityElement = new MajorityElement();
    List<Integer> result = majorityElement.findMajority(nums);
    System.out.println("Majority elements are: " + result);

    scanner.close();
  }
}
