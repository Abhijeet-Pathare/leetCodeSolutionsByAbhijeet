package codesoft.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	//solution using moores voting algorithm
	public static int mooresSolution(int[] arr) {
		int vote = 1;
		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==arr[i]) {
				vote++;
			}else {
				vote--;
			}
			if(vote==0) {
				candidate = arr[i];
			}
		}
		//verify if candidate is the answer or not
		int counter = 0;
		for(int i=0;i<arr.length;i++){
			if(candidate==arr[i]) {
				counter++;
			}
			if(counter >arr.length/2) {
				return candidate;
			}
		}
		return -1;
	}
	
	
	//solution using hashmap approach
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
		//int ans = solution(arr);
		int ans = mooresSolution(arr);
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