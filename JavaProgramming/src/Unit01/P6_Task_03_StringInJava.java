package Unit01;

public class P6_Task_03_StringInJava {

	public static void main(String[] args) {
		String s="i like this program very much";
		String ans="";
		int i=s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') i--;
			int j=i;
			if(i<0) break;
			while(i>=0 && s.charAt(i)!=' ') i--;
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1,j+1));
			}else {
				ans=ans.concat(" "+s.substring(i+1,j+1));
			}
		}
		System.out.println(ans);

	}

}
