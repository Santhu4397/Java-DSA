package Recursion;

public class Linear {
	
	public static void main(String[] args) {
		System.out.println(FibonaciNumber(20));
	}
	
	public static int FibonaciNumber(int num) {
		
		if(num<2) {
			return num;
		}
		
		return FibonaciNumber(num-1)+FibonaciNumber(num-2);
	}

}
