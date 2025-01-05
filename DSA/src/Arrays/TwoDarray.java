package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int [][] arr = new int [3][3];
		
		System.out.println("Enter the  Array value");
		//Take Array values from scanner class
		for(int row=0;row<arr.length;row++) {
			for(int cln=0;cln<arr[row].length;cln++) {
				arr[row][cln]=sc.nextInt();
			}
		}
		
		//printing array values
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
			
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int cln=0;cln<arr[row].length;cln++) {
				System.out.print("["+row+"]"+"["+cln+"]"+":" +arr[row][cln]);
				System.out.print(",");
			}
			System.out.println("");
		}
		
		//create 2D array
		int[][] arr1= {
				{1,2,3},	
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		//Row size
		System.out.println("rows"+arr1.length);
		//Column Size
		System.out.println("Column"+arr1[0].length);
		
		//Using For each loop
		for(int arr2[]:arr1) {
			System.out.println(Arrays.toString(arr2));
		}
	}	

}
