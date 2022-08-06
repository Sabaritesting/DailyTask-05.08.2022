package Task8;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,x=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
System.out.println("The Odd Numbers are");
for(i=1;i<=a;i++) {
	System.out.println(2*i-1);
	x+=2*i-1;
}
System.out.println("The sum of Odd Numbers is"+x);
	}

}
