package Task8;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
double x=sc.nextDouble();
System.out.println("Enter the second number");
double y=sc.nextDouble();
System.out.println("Enter the third number");
double z=sc.nextDouble();
if(x<y&&y<z) {
	System.out.println("Increasing Order");
}
else if(x>y&&y>z) {
	System.out.println("Decresing Order");
}
else {
	System.out.println("Neither Incresing nor Decreasing");
}
	}

}
