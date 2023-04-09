package Unit01;

public class P5_Task_02_ArrayInJava {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int r=2;
		int[] temp=new int[r];
		for(int i=0;i<r;i++) {
			temp[i]=arr[i];
		}
		for(int i=r;i<n;i++) {
			arr[i-r]=arr[i];
		}
		for(int i=0;i<r;i++) {
			arr[n-r+i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
