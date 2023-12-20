package codesoft.dsa;

import java.util.ArrayList;
import java.util.List;
/**
 * Leet Code
 * 2706. Buy Two Chocolates
 * Input: prices = [1,2,2], money = 3
Output: 0
Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.
Example 2:

Input: prices = [3,2,3], money = 3
Output: 3
Explanation: You cannot buy 2 chocolates without going in debt, so we return 3.
	
 */

public class BuyChocolates {
	public static int buyChoco(int[] prices, int money) {
        int i =0;
        List<Integer> sum = new ArrayList<>();
        while(i<prices.length-1){
            int j=i+1;
            while(j<prices.length){
                if(prices[i] + prices[j]<=money){
                    sum.add(prices[i] + prices[j]);
                }
                j++;
            }
            i++;
        }
       
        int k=1;
        if(sum.size()>0){
        int min =sum.get(0);
        while(k<sum.size()){
            if(min>sum.get(k)){
                min = sum.get(k);
            }
            k++;
        }
        return money - min;
        }
        return money;
      
    }
	
	public static void main(String[] args) {
		int[] arr = {69,91,78,19,40,13}; //output should be 62 for this test case
		System.out.println(buyChoco(arr,94));
	}
}
