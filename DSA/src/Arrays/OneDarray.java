package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDarray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		int[] a1=new int[5];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		System.out.println("Started");
		int[] a3=new int[5];
		for(int i=0;i<a3.length;i++ ) {
			System.out.println("inside");
			
			a3[i]=sc.nextInt();
		}
		
		
		System.out.println("Dyanmic Array: "+Arrays.toString(a3));
		System.out.println(a1[2]);
		
		System.out.println(a1);
		
		System.out.println(Arrays.toString(a1));
		
		for(int a2:a1) {
			System.out.println(a2);
			
		}
	}

}
