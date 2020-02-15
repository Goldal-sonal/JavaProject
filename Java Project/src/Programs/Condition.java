package Programs;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
	int age;
	Scanner s= new Scanner(System.in);
	System.out.println("enter the age:");
	age= s.nextInt();
	if (age>=18)
	{
		System.out.println("yes!u can watch movie");
	}
	else
	{
		System.out.println("No!you can't watch movie");
	}
	}

}
