package Arrays;

import java.util.Arrays;

public class Logical {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 66, 47, 36 };
		System.out.println("Before Swap: " + Arrays.toString(arr));
		swap(arr, 0, 4);
		System.out.println("After Swap: " + Arrays.toString(arr));

		System.out.println("print max value in array: " + max(arr));
		System.out.println("print max value in array b/w specifed range: " + maxInRange(arr, 3, 4));
		System.out.println("Before reversing: " + Arrays.toString(arr));
		revers(arr);
		System.out.println("After reversing: " + Arrays.toString(arr));
	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int maxInRange(int[] arr, int start, int end) {
		int max = arr[start];
		for (int i = start; i < end; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void revers(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}

	}
	

}
