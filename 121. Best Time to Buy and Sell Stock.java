/* 121. Best Time to Buy and Sell Stock 

Using two pointers

1. Create a integer call minPrice = Integer.MAX_VALUE
2. Create a integer call maxPrice = 0
3. for loop, if i< prices.length; i++
4. if prices[i] < minprice 
5.  minPrice = prices[i]
6. else if (price[i] - minPrice = maxPrice)
7. maxPrice = price[i] - minPrice
8. return maxPrice

 Here is the following 
 7,1,5,3,6,4
 ^

 minPrice = 7
 maxPrice =0

 if prices[i] < minPrice which is 7 < 7 , no 
 else if (price[i] - minPrice = maxPrice) which is 7-7 = 0), yes
 maxPrice = 0 agin

 go to second loop step

 if prices[i] < minPrice which is 1 < 7, yes
 minprice = 1 
 

 go to third loop step 
 if 5 < 1 , *no 
 else if 5 -1 > 0  *yes
 maxprofit = 5-1 = 4 


 go to four loop step
 if 3 < 1 ,         *no
 else if 3-1 > 4    *no

 go to fifth loop step
 if 6 < 1 ,       *no
 else if 6-1 > 4    *yes
 maxprofit = 5

 go to sixth loop step 
 if 4 < 1 , *no
 else if 4-1 > 5 *no 

 loop finish 

 return maxprofit which is 5 
 */

 class Solution{
     public int maxProfit(int prices[]) {
         int minPrice = Integer.MAX_VALUE;
         int maxPrice = 0;

         for(int i=0; i<prices.length; i++){
             if (prices[i]< minPrice){
                 minPrice = prices[i];
             }else if (prices[i] - minPrice > maxPrice){
                 maxPrice = prices[i] - minPrice;
             }
         }
         return maxPrice;
 }

 /* The second method is Kadane's Algorithm
Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). 
And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). 
Each time we get a positive sum compare it with max_so_far and update max_so_far if it is greater than max_so_far

prices = [7,1,5,3,6,4]

*/
public int maxProfit(int[] prices) {
    int n = prices.length;
    int dp = 0;
    int max = 0;
    for (int i = 1; i < n; i++) {
        int num = prices[i] - prices[i - 1];
        dp = Math.max(dp + num, num);
        max = Math.max(max, dp);
    }
    return max;
}


