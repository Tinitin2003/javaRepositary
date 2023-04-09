package Unit01;

import java.util.Arrays;

public class P5_Task_03_ArrayInJava {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int elementToDelete=4;
		int index=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==elementToDelete) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			for(int i=index;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[n-1]=0;
		}
		System.out.println(Arrays.toString(arr));

	}

}
