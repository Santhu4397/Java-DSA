package Sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 44, 22, 4, 5, 89, 12, 0, -1, -33 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 99 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}

	public static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
