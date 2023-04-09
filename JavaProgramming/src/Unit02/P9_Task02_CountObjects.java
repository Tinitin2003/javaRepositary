package Unit02;
class countObjectClass{
	static int count=0;
	countObjectClass(){
		count++;
	}
	 void getCount() {
		System.out.println("Count of Objects="+count);
	}
}
public class P9_Task02_CountObjects {

	public static void main(String[] args) {
		countObjectClass obj1=new countObjectClass();
		countObjectClass obj2=new countObjectClass();
		countObjectClass obj3=new countObjectClass();
		obj1.getCount();
		obj2.getCount();
		obj3.getCount();
	}
}
