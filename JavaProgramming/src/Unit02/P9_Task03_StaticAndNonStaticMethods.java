package Unit02;
class MyClass{
	static void staticMethod() {
		System.out.println("Static Method is called.(does not need an instance to call)");
	}
	void nonStaticMethod() {
		System.out.println("Non-static Method is called.(needs an instance to call)");
	}
}
public class P9_Task03_StaticAndNonStaticMethods {

	public static void main(String[] args) {
		MyClass.staticMethod();
		MyClass obj=new MyClass();
		obj.nonStaticMethod();
	}

}
