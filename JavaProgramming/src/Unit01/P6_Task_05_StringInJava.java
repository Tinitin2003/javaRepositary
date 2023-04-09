package Unit01;

public class P6_Task_05_StringInJava {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		int[] arr= new int[26];
		int check=0;
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				check=1;
				break;
			}
		}
		if(check==1) {
			System.out.println("Given String is not a Palgram");
		}else {
			System.out.println("Given String is a Palgram");
		}
		

	}

}