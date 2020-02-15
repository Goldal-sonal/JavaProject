package Programs;

import java.util.Scanner;

public class forloop {
public static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		System.out.println("Total is:");
	
		for(int i=2;i<=num;i++)
		{
			 num=num+2;
			 System.out.println(num);
		}

		
	}
	
}

