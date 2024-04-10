package codesoft.leetcode;

public class GreatestCommonDivisorOfStrings {

		public static String gcdOfStrings(String str1, String str2) {
			String s1 = str1+str2;
			String s2 = str2+str1;
			if(!s1.equalsIgnoreCase(s2)) {
				return "";
			}
			int gcd = gcd(str1.length(),str2.length());
			return str1.substring(0,gcd);
	}

	private static int gcd(int a, int b) {
		
	        return b == 0 ? a : gcd(b, a % b);
		}

	public static void main(String[] args) {
		/*todo: check for this test case  */
		String s1 ="ABABAB"; //"ABCABC";//"ABABAB"
		String s2 = "ABAB";//"ABC";//"ABAB" 
		
		
		System.out.println(gcdOfStrings(s1, s2));
	}

}


