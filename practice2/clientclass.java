package practice2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import serviceclass.teacher;
public class clientclass {
	private static Scanner input=new Scanner(System.in);
	static String name;
	static String subject;
	static HashSet<teacher> set = new HashSet<teacher>();
public static void main(String args[])
{
	int option;
   do {
	   option=menu();
	   switch(option)
	   {
	   case 1:
	   {
	for(int i=0;i<3;i++)
	{
		System.out.println("enter name:");
	name=input.next();
	System.out.println("enter subject:");
	subject=input.next();
    set.add(new teacher(name,subject));
	}
	   }
	   break;
	   case 2:
	   {
		   if(set.size()!=0)
		   {
		   Iterator<teacher> it = set.iterator();
			 
			while (it.hasNext())
			{
			    teacher teacher = (teacher) it.next();
			 
			    System.out.println(teacher);
			} 
		   }
		   else
		   {
			   System.out.println("list is empty. please add elements: ");
			   option=1;
		   }
	   }
	   break;
	   case 3:
	   {
		   System.out.println("thank you!");
	   }
	   break;
	   default :
	   {
		   System.out.println("please enter valid option!");
	   }
	   }
   }while(option!=3);
}
private static int menu() {
	System.out.println("1. add teacher data 2.display teachers 3.exit enter your choice: ");
	int choice=input.nextInt();
	return choice;
}
}
