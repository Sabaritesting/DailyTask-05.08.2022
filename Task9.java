package Task8;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
int b=0,r;
int c=a;
while(a>0) {
	r=a%10;
	b=(b*10)+r;
	a=a/10;
}
if(b==c) {
	System.out.println("The number is Palindrome");
}
else {
	System.out.println("The number is not Palindrome");
}
	}

}
