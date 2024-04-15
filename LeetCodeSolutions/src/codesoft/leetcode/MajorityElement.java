package codesoft.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static int solution(int[] arr) {
		int length = arr.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(int i=0;i<length;i++) {
			if(map.get(arr[i])>length/2) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,2,6,6,6,2,2,8,2,2};
		int ans = solution(arr);
		System.out.println("Majority element is "+ans);
	}
	
}


/**
Given an array you need ot find a majority element in the array.
Majority elem is defined as the elem which is appearing more than
n/2 times in the array with length n. Return -1 if there is no such element in 
the array.
Note: there will be only one majority elem or no elem

IP:{2,2,6,6,6,2,2,8,2,2}
OP: 2 
*/