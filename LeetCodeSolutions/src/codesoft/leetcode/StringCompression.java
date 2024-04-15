package codesoft.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCompression {
	
	public static int compress(char[] chars) {
		char[] ans = new char[chars.length];
		//if contains only one char return 1
		if(chars.length == 1) {
			ans[0]=1;
			return 1;
		}
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<chars.length;i++) {
			if(map.containsKey(chars[i])) {
				map.put(chars[i], map.get(chars[i])+1);
			}else {
				map.put(chars[i], 1);
			}
		}
		System.out.println(map);
		Set<Character> unique = new HashSet<>();
		for(char ch : chars) {
			unique.add(ch);
		}
		List<Character> uniqueList = new ArrayList<>(unique);
		System.out.println(uniqueList);
		int j=0;
		for(int i=0;i<unique.size()*2;i+=2) {
			if(map.containsKey(uniqueList.get(j))) {
				int val = map.get(uniqueList.get(j));
				
				ans[i]=uniqueList.get(j);
				ans[i+1]= Integer.toString(val).charAt(0);
				j++;
				System.out.println(Arrays.toString(ans));
				if(i==uniqueList.size()) {
					break;
				}
				continue;
			}
		}
		System.out.println(Arrays.toString(ans));

		
		return 0;
	}
	
	public static void main(String[] args) {
		char[] chars = {'a','a','b','b','c','c','c'};
		compress(chars);
	}
}


/***
 * 443. String Compression
Medium
Topics
Companies
Hint
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 

Constraints:

1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
*/
