package Task8;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
int b=0;
for(int i=0;i<a;a++) {
	if(i*(i+1)==a)
	{
	b=1;
	break;
	}
}
if(b==1) {
	System.out.println("Pronic Number");
}
else
	System.out.println("Not a Pronic Number");
	}

}
