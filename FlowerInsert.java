package codesoft.dsa;

public class FlowerInsert {
	public static int[] flowerGarden(int[] arr, int n) {
		int num = n;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-2) {
			if(arr[i]==1 && arr[i+1]==0) {
				arr[i+2]=1;
				num--;
			}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1};
		int n = 1;
		int[] result = flowerGarden(arr,n);
		for(int a : result) {
			System.out.println(a);
		}
	}
}
