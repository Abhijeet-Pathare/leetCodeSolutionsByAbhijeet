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
			
			
//	     	String s;
//			int maxLength = Math.max(str1.length(), str2.length());
//	        if(str1.length()==str2.length() && str1.equalsIgnoreCase(str2)){
//	            System.out.println("inside equals");
//	            return "";
//	        }
//			if(str1.length()==maxLength && str1.contains(str2)) {
//				System.out.println(str1.contains(str2));
//				if(str1.length()/2<str2.length()) {
//					System.out.println("inside if");
//					int i =0;
//					int j = str1.length()/2;
//					while(i<=str1.length()/2){
//						System.out.println("inside while");
//					str1.contains(str2.subSequence(0,j));
//					s = str1.replace(str2.substring(0, j), "");
//					System.out.println(s.length());
//					if(s.length()==0) {
//						return str2.substring(0, j);
//					}
//					j--;
//					i++;
//					}
//				}
//				s = str1.replace(str2, "");
//				if(s.length()==0) {
//					return str2;
//				}
//			}else if(str2.length()==maxLength && str2.contains(str1)) {
//				if(str2.length()/2<str1.length()) {
//					System.out.println("inside if");
//					int i =0;
//					int j = str2.length()/2;
//					while(i<=str2.length()/2){
//						System.out.println("inside while");
//					str1.contains(str1.subSequence(0,j));
//					s = str2.replace(str1.substring(0, j), "");
//					System.out.println(s+"a");
//					if(s.length()==0) {
//						return str1.substring(0, j);
//					}
//					j--;
//					i++;
//					}
//				}
//	            
//	            s = str2.replace(str2, "");
//	            System.out.println(s+"a");
//				if(s.length()==0) {
//					return str1;
//				}
//			}
//			
//			return "";
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
