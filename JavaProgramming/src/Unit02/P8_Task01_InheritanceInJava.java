package Unit02;
class Animal{
	void showData() {
		System.out.println("Parents Method called.");
	}
}
class Mammals extends Animal{
	void showData() {
		super.showData();
		System.out.println("Child Method called");
	}
}
public class P8_Task01_InheritanceInJava {

	public static void main(String[] args) {
		Mammals obj=new Mammals();
		obj.showData();
		
	}

}
