package Unit01;

import java.util.Arrays;

public class P5_Task_04_ArrayInJava {

	public static void main(String[] args) {
		int[] arr = {3, 1, 7, 2, 9, 4, 5, 8, 6};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);

	}

}
