package Unit01;

import java.time.LocalDate;
import java.util.Scanner;

public class P7_Task_01_SwtichCasesInJava {

	public static void main(String[] args) {
		System.out.println("Enter 1 for current year\nEnter 2 for current month\nEnter 3 for current day");
		
		System.out.print("Enter Input:");
		 int input;
		 Scanner sc=new Scanner(System.in);
		 input=sc.nextInt();
	        LocalDate currentDate = LocalDate.now();
	        switch (input) {
	            case 1:
	                System.out.println("Current year: " + currentDate.getYear());
	                break;
	            case 2:
	                System.out.println("Current month: " + currentDate.getMonthValue());
	                break;
	            case 3:
	                System.out.println("Current day: " + currentDate.getDayOfMonth());
	                break;
	            case 4:
	                System.out.println("Not applicable");
	                break;
	            default:
	                System.out.println("Invalid input");
	                break;
	        }
	        sc.close();
	}

}
