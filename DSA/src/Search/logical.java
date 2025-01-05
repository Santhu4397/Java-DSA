package Search;

public class logical {

	public static void main(String[] args) {
	nubevenDigits(new int[]{222,43,3333,7,66,55});	
	int[][] arr1= {
			{1,2,3},	
			{4,5,6},
			{7,8,9},
			{10,11,12}
	};
	findSumMaxin2D(arr1);
	}
	
	public static void nubevenDigits(int [] arr) {
		int count=0;
		
		for(int i:arr) {
		if(isItEven(i)) {
			count++;
		}
		}
		System.out.println("number of even digits"+count);
	}
	
	public static boolean isItEven(int  num) {
		
			return numberSize(num)%2==0;
		
		
	}
	public static int numberSize(int num) {
		
		if(num<0) {
			num=num*-1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	
	}
	
	public static void findSumMaxin2D(int [][] arr) {
		
		int max=Integer.MIN_VALUE;
		int sum=0;
		 for(int[] i:arr) {
			 for(int j:i ) {
				 sum+=j;
			 }
			 
			 if(sum>max) {
				 max=sum;
			 }
			 sum=0;
		 }
		 System.out.println(max);
	}
}
