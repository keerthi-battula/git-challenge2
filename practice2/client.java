package practice2;
import java.util.Scanner;

import serviceclass.manipulations;
import serviceclass.operations;
public class client {
private static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		boolean option=false;
		do
		{
		int a,b,flag=0;
		System.out.println("enter a and b values to perform manipulations:");
		a=input.nextInt();
		b=input.nextInt();
		operations operations=new operations();
		try {
		operations.add(a,b);
		operations.sub(a,b);
		operations.mul(a,b);
		operations.div(a,b);
		}
		catch(ArithmeticException e )
		{
			if(e.getMessage().equals("/ by zero"))
			{
				flag=1;
			}
		System.out.println(e.getMessage());	
		}
		finally
		{
			System.out.println(operations.add(a,b));
			System.out.println(operations.sub(a,b));
			System.out.println(operations.mul(a,b));
			if(flag!=1)
			{
			System.out.println(operations.div(a,b));
			}
		}
		System.out.println("do you want to continue: ");
		String str=input.next();
		if(!str.equals("yes"))
		{
			System.out.println("thank you!");
			option=true;
		}
		}while(option!=true);
	}
}
