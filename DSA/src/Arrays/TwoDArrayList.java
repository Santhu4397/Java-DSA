package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	List<ArrayList<Integer>> arr = new ArrayList<>();
	
	for(int i=0;i<3;i++) {
		arr.add(new ArrayList<Integer>());
	}
	
	System.out.println(arr);
	System.out.println("Enter the  Array value");
	for(int rows=0;rows<arr.size();rows++) {
		for(int cln=0;cln<3;cln++) {
			arr.get(rows).add(sc.nextInt());
		}
	}
	System.out.println(arr);
	

	for(int row=0;row<arr.size();row++) {
		for(int cln=0;cln<arr.get(row).size();cln++) {
			System.out.print("["+row+"]"+"["+cln+"]"+":" +arr.get(row).get(cln));
			System.out.print(",");
		}
		System.out.println("");
	}
	}

}
