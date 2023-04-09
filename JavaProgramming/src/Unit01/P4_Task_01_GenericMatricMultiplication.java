package Unit01;
import java.util.Scanner;
public class P4_Task_01_GenericMatricMultiplication {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the first matrix:");
		int m1=input.nextInt();
		int n1=input.nextInt();
		System.out.println("Enter the number of rows and columns of the second matrix:");
		int m2=input.nextInt();
		int n2=input.nextInt();
		if(n1!=m2) {
			System.out.println("Matrices cannot be multipied");
			System.exit(0);
		}
		Integer[][] matrix1=new Integer[m1][n1];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		Integer[][] matrix2=new Integer[m2][n2];
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				matrix2[i][j]=input.nextInt();
			}
		}
		Integer[][] result=new Integer[m1][n2];
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				result[i][j]=0;
				for(int k=0;k<n1;k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];			}
			}
		}
		System.out.println("The product of the matrices is:");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		input.close();

	}

}
