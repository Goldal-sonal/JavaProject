package Programs;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		if(num % 2==0)
		{
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");

	}

}
