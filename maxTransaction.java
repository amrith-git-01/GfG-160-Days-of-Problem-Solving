import java.util.Scanner;

class maxTransaction {
  public int maximumProfit(int prices[]) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of days:");
    int n = sc.nextInt();
    int[] prices = new int[n];

    System.out.println("Enter the stock prices:");
    for (int i = 0; i < n; i++) {
      prices[i] = sc.nextInt();
    }

    maxTransaction obj = new maxTransaction();
    System.out.println("Maximum Profit: " + obj.maximumProfit(prices));

    sc.close();
  }
}
