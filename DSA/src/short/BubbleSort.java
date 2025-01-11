package Sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr= {44,22,4,5,89,12,0,-1,-33};
		int [] arr1= {1,2,3,4,5,6,7,8,99};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static  void sort(int[] arr) {
		
		boolean swapped;// this used to not resort array which is already shorted 
		
		//run the steps n-1 times
		for(int i=0; i<arr.length;i++) {
			
			//for each steps max item will come at the respective last index
			swapped=false;
			for(int j=1;j<arr.length-i;j++) {
			//Swap if the item is smaller than the previous item	
				if(arr[j]<arr[j-1]) {
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
				
			}
			
			if(swapped==false) {
				break;
			}
			System.out.println("number of itreation: "+i);
		}
	}
}
