package Search;

import java.util.Arrays;

public class TwoDLinearSearch {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{23,24,5,76},
				{2,4,6,7},
				{100,44,555,66,77,0}
		};
		
		System.out.println("Find Array index: "+Arrays.toString(searchIndix(arr, 79)));
		System.out.println("Find Array value: "+searchElement(arr, 99));
	}
	
	public static int[]  searchIndix(int[][] arr,int target) {
		if(arr.length==0) {
			return  new int[]{-1,-1};
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int cln=0;cln<arr[row].length;cln++) {
				if(target==arr[row][cln]) {
					return new int[]{row,cln};
				}
				
			}
		}
		return  new int[]{-1,-1};
	}
	
	public static int  searchElement(int[][] arr,int target) {
		if(arr.length==0) {
			return  -1;
		}
		
		for(int[] i:arr) {
			for(int j:i) {
				if(j==target) {
					return j;
				}
			}
		}
		return  -1;
	}

}
