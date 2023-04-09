package Unit01;
class Calculator{
	public static int add(int a,int b) {
		return a+b;
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static double divide(int a,int b) {
		return a/b;
	}
}
public class P3_Task_01_CalculatorInJava {
	public static void main(String[] args) {
		int x=4;
		int y=2;
		int sum=Calculator.add(x, y);
		int difference=Calculator.subtract(x, y);
		int product=Calculator.multiply(x, y);
		double quotient=Calculator.divide(x, y);
		System.out.println("The sum is:"+sum);
		System.out.println("The difference is:"+difference);
		System.out.println("The product is:"+product);
		System.out.println("The quotient is:"+quotient);
	}
}
