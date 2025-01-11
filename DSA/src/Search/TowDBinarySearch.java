package Search;

import java.util.Arrays;

public class TowDBinarySearch {
	public static void main(String[] args) {
		
		int [][] arr= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		
		int [][] arr1= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		System.out.println(Arrays.toString( search(arr1, 15)));
	}
	
	static int[] search(int[][] arr,int traget) {
		
		int r=0;
		int c=arr.length-1;
		
		while(r<arr.length &&c>=0) {
			if(arr[r][c]==traget) {
				return new int[] {r,c};
			}
			
			if(arr[r][c]<traget) {
				r++;
			}else {
				c--;
			}
		}
		
		return new int[] {-1,-1};
	}

}
