package codesoft.leetcode;

public class RotateMatrixByNintyDegree {

	public static void rotateBy90(int[][] arr) {
		//step 1: take transpose of arr
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//swap a[i][j] with a[j][i]
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		//swap the columns
		int left = 0, right = arr[0].length-1;
		while(left<right) {
			for(int i=0;i<arr.length;i++) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
			}
			left++;
			right--;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");

			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");

			}
			System.out.println();
		}
		rotateBy90(arr);
		
	}
}

/**
 * Given a square matrix of N*N.Rotate it by 90 degree in 
 * clockwise direction without using any extra space.
 *
 * ip:
 * 	1  2  3  4  
	5  6  7  8  
	9  10 11 12  
	13 14 15 16 
	
 * op:
 * 	13   9 5  1  
	14  10 6  2  
	15  11 7  3  
	16  12 8  4  
*/