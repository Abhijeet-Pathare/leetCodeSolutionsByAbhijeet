package codesoft.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static int[] twoSum(int[] arr,int target) {
		int[] result = new int[2];
		int resIndex=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			//putting new values to map
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
			if(map.containsKey(target-arr[i])) {
				//adding indexes to result array
				result[resIndex]=map.get(arr[i]);
				result[++resIndex]= map.get(target-arr[i]);
			}
		}	
		System.out.println(map);
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {11,3,7,9,14,2};
		int target = 17;
		int[] ans = TwoSumProblem.twoSum(arr,target);
		System.out.println(Arrays.toString(ans));
	}
}

//return indexes of an array whos sum is equal to the target value.

