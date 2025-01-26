package Recursion;

public class Dividion {
	
	public static void main(String[] args) {
		
		int [] arr= {-40,-3,-1,2,4,56,67,68,78,89};
		System.out.println(BinarySearch(arr, -49, 0, arr.length-1));
		
	}
	
	public static  int BinarySearch(int[] arr ,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int m=start+(end-start)/2;
		if(arr[m]==target) {
			return m;
		}
		if(target<arr[m]) {
			return BinarySearch(arr, target, start, m-1);
		}
		return BinarySearch(arr, target, m+1, end);
	}

}

