import java.util.*;

public class BinarySearchExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input array must be sorted in ascending order for binary search
		int[] array = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		
		System.out.println("Enter the number to search:");
		int target = scanner.nextInt();
		
		int index = binarySearch(array, target);
		
		if (index != -1) {
			System.out.println(target + " found at index " + index);
		} else {
			System.out.println(target + " not found in the array");
		}
		
		scanner.close();
	}
	
	// Binary search function to find the index of target in the array
	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			// Check if the middle element is the target
			if (array[mid] == target) {
				return mid; // Target found, return the index
			} else if (array[mid] < target) {
				// If target is greater, ignore left half
				low = mid + 1;
			} else {
				// If target is smaller, ignore right half
				high = mid - 1;
			}
		}
		
		// Target not found in the array
		return -1;
	}
}
