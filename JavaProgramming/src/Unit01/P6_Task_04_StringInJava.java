package Unit01;

import java.util.Scanner;

public class P6_Task_04_StringInJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter number:");
		num=sc.nextInt();
		int temp=num;
		 String roman="";
	        
	        while(num>0){
	            if(num>=1000){
	            roman+='M';
	            num-=1000;
	        }else  if(num>=900 && num<1000){
	            roman+='C';
	            roman+='M';
	            num-=900;
	        }else if(num>=500){
	            roman+='D';
	            num-=500;
	        }else if(num>=400){
	            roman+='C';
	            roman+='D';
	            num-=400;
	        }else if(num>=100){
	            roman+='C';
	            num-=100;
	        }else if(num>=90 && num<100){
	            roman+='X';
	            roman+='C';
	            num-=90;
	        }else  if(num>=50 && num<=100){
	            roman+='L';
	            num-=50;
	        }else if(num>=40){
	            roman+='X';
	            roman+='L';
	            num-=40;
	        }else if(num>=10){
	            roman+='X';
	            num-=10;
	        }else if(num==9){
	            roman+='I';
	            roman+='X';
	            num-=9;
	        }else if(num>=5 && num<10){
	              roman+='V';
	              num-=5;
	        }else if(num==4){
	            roman+='I';
	            roman+='V';
	            num-=4;
	        }else if(num<5){
	                 roman=roman+'I';
	             num--;
	        }
	        }
	        System.out.println("Roman numeral of "+temp+" is="+roman);
	        sc.close();
	}

}
