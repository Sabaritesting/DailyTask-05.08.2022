package Task8;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("the first lucas numbers are");
int a=10,b=2,c=1,d;
if(a>1) {
	System.out.println("/c/b");
	for(int i=2;i<a;++i) {
		d=c;
		c+=b;
		b=d;
		System.out.println(c);
	}
}
else if(a==1) {
	System.out.println("/c");
	}
else
	System.out.println("Enter a input value");
}
}