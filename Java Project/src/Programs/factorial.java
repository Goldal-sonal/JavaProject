package Programs;

import java.util.Scanner;

public class factorial {
public static Scanner sc;
	public static void main(String[] args) {
		int num,i=1;
		double fact=1;
		sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(i<=num)
		{
			fact=fact*i;
			i++; 
			System.out.println("factorial of"+num+"is; "+fact);
			
		}
		
		
		
	

	}

}
