import java.util.Scanner;

public class BuyandSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i] = sc.nextInt();
        }
        System.out.println((caculateMaxProfit(prices)));
        //[7,1,5,3,6,4]
    }
    public static int caculateMaxProfit(int prices[])
    {
        int min_price = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            int cost = prices[i] - min_price;
            profit = Math.max(cost,profit);
            min_price = Math.min(prices[i],min_price);
        }
        return profit;
    }
}
/*
Buy and Sell Stocks
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.
Example Input

Input 1:
A = [1, 2]
Input 2:
A = [1, 4, 5, 2, 4]

Output 1:
1
Output 2:

4
 */
