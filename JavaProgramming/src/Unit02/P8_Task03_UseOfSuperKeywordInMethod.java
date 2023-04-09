package Unit02;
class MyBaseClass{
	void MethodArea() {
		//super();	error:Constructor call must be the first statement in a constructor
	}
	void displayError() {
		System.out.println("error:Constructor call must be the first statement in a constructor");
	}
}

public class P8_Task03_UseOfSuperKeywordInMethod {

	public static void main(String[] args) {
		MyBaseClass obj=new MyBaseClass();
		obj.displayError();
	}

}
