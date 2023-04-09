package Unit01;

import java.util.Scanner;

public class P6_Task_01_StringInJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		String rstr="";
		System.out.print("Enter a String:");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		if(str.equals(rstr)) {
			System.out.print("String is Palindrome");
		}else {
			System.out.print("String is Not a Palindrome");
		}
		sc.close();

	}

}
