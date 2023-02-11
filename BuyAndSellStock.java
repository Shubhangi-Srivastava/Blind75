/**
 * Leetcode Problem 121 : Best time to buy and Sell Stock
 * Author: Shubhangi Srivastava
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */
class BuyAndSellStock {
    public static void main (String args[]){
        int arr[] = {7,6,4,3,1};
        BuyAndSellStock obj = new BuyAndSellStock();
        int ans  = obj.maxProfit(arr);
        System.out.println(ans);
    }   
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
     for(int i = 0 ; i < prices.length; i++){
         if(prices[i] < min){
             min = prices[i];
         } 
         else if(prices[i] - min > maxProfit){
              maxProfit = prices[i] - min;
         }
    }
     return maxProfit;
    }
    }
    