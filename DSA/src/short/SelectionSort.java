package Sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int [] arr= {44,22,4,5,89,12,0,-1,-33};
		int [] arr1= {1,2,3,4,5,6,7,8,99};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int lastindex=arr.length-i-1;
			int maxIndex=findMaxIndex(arr,0,lastindex);
			swap(arr, maxIndex, lastindex);
		}
	}
	
	public static void swap(int [] arr, int start,int end) {
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	
	public static int findMaxIndex(int [] arr,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

}
