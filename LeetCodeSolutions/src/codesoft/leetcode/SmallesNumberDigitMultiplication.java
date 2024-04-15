package codesoft.leetcode;

public class SmallesNumberDigitMultiplication {
	
	public static int solution(int n) {
		//string builder to append number ans
		StringBuilder ans = new StringBuilder();
		for(int div = 9;div>=2;div--) {
			while(n%div == 0) {
				n=n/div;
				ans = ans.append(div);
			}
		}
		
		//check for prime number, if number is !=1 it means it is a prime number 
		if(n !=1) {
			return -1;
		}else {
			return Integer.parseInt(ans.reverse().toString()) ;
		}
	}
	
	public static void main(String[] args) {
		int n = 1000;
		int ans = solution(n);
		System.out.println(ans);
	}
}


/**
 * Smallest number whose product of digits is N
 * N = 1000
 * OP = 5558
 * 
 * n=100
 * OP=455
 * 
 * n=13
 * OP=-1
 * 
 * N=81000
 * OP=555899
 */
