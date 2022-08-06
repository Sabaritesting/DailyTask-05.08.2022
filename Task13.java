package Task8;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first floating number");
double a=sc.nextDouble();
System.out.println("Enter the second second floating number");
double b=sc.nextDouble();
if (Math.abs(a - b) <= 0.01) { 
    System.out.println("These numbers are the same."); 
} 
else { 
    System.out.println("These numbers are different."); 
} 
	}

}
