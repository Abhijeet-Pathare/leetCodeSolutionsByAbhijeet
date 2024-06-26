package codesoft.leetcode;

import java.util.Arrays;

public class ArrayConcatenation {
	
	public static int numIdenticalPairs(int[] a) {
		int counter = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					counter++;
				}
			}
		}
		return counter;
	}
//	public static int[] getConcatenation(int[] a) {
//		int[] con = new int[a.length*2];
//		int j=0;
//		for(int i=0;i<con.length;i++) {
//			
//			if(j<a.length) {
//				con[i]=a[j];
//				j++;
//			}else {
//				j=0;
//				con[i]=a[j];
//				j++;
//			}
//			
//		}
//		return con;
//	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(a));
//		int[] a = {1,2,3};
//		
//		int[] result = getConcatenation(a);
//		System.out.println(Arrays.toString(result));
	}
}

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
*/
