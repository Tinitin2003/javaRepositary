package Unit01;

import java.util.Scanner;

public class P6_Task_02_StringInJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string:");
		String str1=sc.nextLine();
		System.out.print("Enter Second string:");
		String str2=sc.nextLine();
		if(str1.equals(str2)) {
			System.out.print("String is equal");
	}
		else {
			System.out.print("String is not equal");
		}
			sc.close();
	}

}
