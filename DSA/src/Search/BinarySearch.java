package Search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -2, -1, 0, 2, 3, 4, 66, 77, 86, 88, 99 };
		int[] arrDesc= {99,88,86,77,66,4,3,2,0,-1,-2};
		System.out.println(Search(arr, 86));
		System.out.println(SearchOrdeAgnostic(arr, 86));
		System.out.println(SearchOrdeAgnostic(arrDesc, 86));

	}

	public static int Search(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (target < arr[middle]) {
				end = middle - 1;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}

		return -1;
	}

	public static int SearchOrdeAgnostic(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];// To find if array is shorted Ascending or not.

		while (start <= end) {
			int middle = start + (end - start) / 2;

			if (target == arr[middle]) {
				return middle;
			}
			if (isAsc) {//if array is shorted in ascending order then comes this 
				if (target < arr[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			} else {
				if (target > arr[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
		}

		return -1;
	}
}
