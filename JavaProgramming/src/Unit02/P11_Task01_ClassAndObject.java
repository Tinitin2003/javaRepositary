package Unit02;

import java.util.Scanner;

public class P11_Task01_ClassAndObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phno = sc.nextLine();
        System.out.print("Enter subscriber name: ");
        String sname = sc.nextLine();
        System.out.print("Enter number of calls made: ");
        int n = sc.nextInt();
        Telcall t = new Telcall(phno, sname, n);
        t.compute();
        t.display();
        sc.close();
    }
}

class Telcall {
    private String phno;
    private String sname;
    private int n;
    private double amt;
    
    Telcall(String phno, String sname, int n) {
        this.phno = phno;
        this.sname = sname;
        this.n = n;
        this.amt = 0;
    }
    


    void compute() {
        if(n>300) {
            amt=(n - 300)*1.5;
            n=300;
        }
        if(n>200 && n<=300) {
            amt +=(n - 200) * 1.2;
            n=200;
        }
        if(n>100 && n<=200) {
            amt+= (n - 100) * 1.0;
            n=100;
        }
        if(n<=100) {
            amt+=500.0;
        }
    }
    
    void display() {
        System.out.println("Bill amount: Rs. " + amt);
    }
}
