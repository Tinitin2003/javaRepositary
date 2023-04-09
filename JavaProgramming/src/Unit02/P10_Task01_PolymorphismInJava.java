package Unit02;
class ABC{
	   int add(int x,int y,int z) {
		System.out.println("Parent's method is called");
		return x+y+z;
	}
	   int add(int x,int y) {
		   System.out.println("Parent's method is called");
		   return x+y;
		   
	   }
}
class CBA extends ABC{
	@Override
	  int add(int x,int y,int z) {
		System.out.println("Children's method is called");
		return x+y+z;
	}
	int add(int w,int x,int y,int z) {
		System.out.println("Children's method is called");
		return w+x+y+z;
	}
}
public class P10_Task01_PolymorphismInJava {

	public static void main(String[] args) {
		ABC obj=new CBA();
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.add(20,30));
		/*System.out.println(obj.add(10,20,30,40));
		 * Can't find add(,,,,) in Parent's class(object type is ABC)*/
		
		CBA obj2=new CBA();
		System.out.println(obj2.add(10,20,30));
		System.out.println(obj2.add(10,20,30,40));
	}

}
