/*122. Best Time to Buy and Sell Stock II 

The differents bewteen 122 and 121 is 122 request buy one and sell one share of the stock multiple times

Just thinking about the max profit in what day

*/
public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        int sub = prices[i] - prices[i - 1];
        if (sub > 0) {
            profit += sub;
        }
    }
    return profit;
}