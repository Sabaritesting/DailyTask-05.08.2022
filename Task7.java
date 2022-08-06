 package Task8;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
int b=(int)Math.round(Math.pow(a,1.0/3.0));
if((a==b*b*b))
{
	System.out.println("Number is Cube");
}
else {
	System.out.println("Number is not Cube");
}
	}

}
