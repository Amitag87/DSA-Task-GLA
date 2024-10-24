import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int diff = money - (prices[1]+prices[0]);
        if(diff >= 0){
            return diff;
        }
        else{
            return money;
        }
    }
}