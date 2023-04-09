package Unit01;

public class P5_Task_01_ArrayInJava {

	public static void main(String[] args) {
		 int[] arr = {1, 4, 3, 4, 5,5, 6, 3, 8, 9, 1};
	     int[] duplicates = new int[10];
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    boolean isDuplicate = false;
	                    for (int k = 0; k < duplicates.length; k++) {
	                        if (arr[i] == duplicates[k]) {
	                            isDuplicate = true;
	                            break;
	                        }
	                    }
	                    if (!isDuplicate) {
	                        duplicates[index] = arr[i];
	                        index++;
	                    }
	                }
	            }
	        }

	        System.out.print("Duplicate elements are: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(duplicates[i] + " ");
	        }

	}

}
