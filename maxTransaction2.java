import java.util.Scanner;

public class maxTransaction2 {
  public int maximumProfit(int prices[]) {
    int len = prices.length;
    int res = 0;
    int min = prices[0];
    for (int i = 1; i < len; i++) {
      min = Math.min(min, prices[i]);
      res = Math.max(res, prices[i] - min);
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of days: ");
    int n = scanner.nextInt();
    int[] prices = new int[n];
    System.out.println("Enter the prices: ");
    for (int i = 0; i < n; i++) {
      prices[i] = scanner.nextInt();
    }
    maxTransaction2 obj = new maxTransaction2();
    int result = obj.maximumProfit(prices);
    System.out.println("Maximum Profit: " + result);
    scanner.close();
  }
}
