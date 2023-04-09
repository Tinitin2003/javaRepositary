package Unit01;

public class P2_Task02_ConstantsInJava {
	static final int globalVariable=5;
	
	public static void main(String[] args) {
		final int localVariable=0;
		System.out.println("Local Main Variable:");
		System.out.println(localVariable);
		System.out.println("Global Main Variable:");
		System.out.println(globalVariable);
		func();
		/*
		 * The final local variable localVariable cannot be assigned. It must be blank
		 * and not using a compound assignment localVariable=10;
		 */
	}
	static void func() {
		System.out.println("Global Function Variable:");
		System.out.println(globalVariable);
		/*
		 * localVariable cannot be resolved to a variable
		 * System.out.println(localVariable);
		 */
		
	}
}
