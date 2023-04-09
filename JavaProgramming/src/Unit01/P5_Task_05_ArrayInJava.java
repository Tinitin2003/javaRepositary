package Unit01;

import java.util.Arrays;

public class P5_Task_05_ArrayInJava {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0}; 
        int elementToInsert = 6; 
        int indexToInsert = 7; 
        for (int i = arr.length - 1; i > indexToInsert; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexToInsert] = elementToInsert;
        System.out.println(Arrays.toString(arr));
	}

}
