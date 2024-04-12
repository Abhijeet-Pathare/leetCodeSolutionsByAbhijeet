package codesoft.leetcode;

import java.util.Collections;

public class ReverseWordsInAString {
	
	public static void reverseWordsInAString(String str) {
		if(str.length()==0 || str.isBlank()) {
			System.out.println("String should not be empty");
			return;
		}
		String s = str.trim();
		String[] wordsArray = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=wordsArray.length-1;i>=0;i--) {
			sb.append(wordsArray[i]+" ");
		}
		sb.toString().trim();//removes the extra white spaces
		System.out.println("Reversed String");
		System.out.println(sb);
		}
	
	public static void main(String[] args) {
		
		String s = " a  ";//"    I am Abhijeet";
		reverseWordsInAString(s);
		
//		String str = s.trim();
//		String[] str1 = str.split(" ");//this returns an array of strings excluding spaces. i.e words
//		StringBuffer sb = new StringBuffer();//StringBuffer as strings are not mutable
//		for(String s1 : str1) {
//			System.out.println(s1);
//		}
//		for(int i=str1.length-1;i>=0;i--) {
//			sb.append(str1[i]+" ");//append the last word first and also append a space after the word
//		}
//		System.out.println(sb.toString().trim());// used trim to remove the trailing space at the end which will be added after the last word
//		String s4 = "bajsdhjas";
	}
}































// String str = s.trim();
//String[] str1 = s.split("\\s+");
//StringBuffer sb = new StringBuffer();
//for(int i =str1.length-1;i>=0;i--){
//    sb.append(str1[i]+" ");
//}
//return sb.toString().trim();
