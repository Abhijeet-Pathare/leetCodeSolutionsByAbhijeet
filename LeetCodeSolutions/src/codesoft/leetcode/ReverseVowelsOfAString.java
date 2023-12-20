package codesoft.leetcode;

/**
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */

public class ReverseVowelsOfAString {
	public static boolean isVowel(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ||
           x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
               return true;
           }
           return false;
    }

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while(start<end ){
            if(isVowel(s.charAt(start)) && isVowel(s.charAt(end))){
                char temp = ch[start];
                ch[start]= ch[end];
                ch[end] = temp;
                start++;
                end--;
            }else if(isVowel(s.charAt(start))){
                end--;
            }else{
                start++;
            }
        }
        return String.valueOf(ch);
    }
    
    public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowels(s));
	}
}
