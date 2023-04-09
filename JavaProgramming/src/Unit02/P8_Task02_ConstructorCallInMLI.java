package Unit02;
class A{
	A(){
		System.out.println("Default constructor of A called.");
	}
	A(int n){
		System.out.println("Paramaterized constructor of A is called with entered number="+n);
	}
}
class B extends A{
	B(){
		System.out.println("Default constructor of B  is called.");
	}
	/*If B's default constructor in not written then it will give following error
	Implicit super constructor B() is undefined. Must explicitly invoke another constructor*/
	B(int n){
		System.out.println("Paramaterized constructor of B is called with entered number="+n);
	}
}
class C extends B{
	C(){
		System.out.println("Default constructor of C called.");
	}
	C(int n){
		System.out.println("Paramaterized constructor of C is called with entered number="+n);
	}
	void display() {
		System.out.println("Program completed.");
	}
}
public class P8_Task02_ConstructorCallInMLI {
	public static void main(String[] args) {
		C obj=new C();
		obj.display();
	}
}

//use super keyword where ever possible