package codesoft.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringOccurence {
	
	
	
	public static void main(String[] args) {
		String city = "mumbai";
		char[] cityArr = city.toCharArray();
		Map<Character,Integer> map1 = new HashMap<>();
		for(int i=0;i<cityArr.length;i++) {
			if(map1.containsKey(cityArr[i])) {
				map1.put(cityArr[i], map1.get(cityArr[i])+1);
			}else {
				map1.put(cityArr[i], 1);
			}
		}
		System.out.println(map1);
		
	}

}


/*
//Find the no of occurance of each character of String and sort the result keywise
//input is  mumbai 
a=1
b=1
i=1
m=2
u=1
*/