package Programs;

import java.util.Scanner;

public class method_Pantagon {
	
	
	
	
	public static double Pentagon_area(int n,double s)
	{
	
		
		return(n*s*s)/(4*Math.tan(Math.PI/n));
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input the number of sides:");
		int n=input.nextInt();
		System.out.println("input the sides");
		double s=input.nextDouble();
		
		System.out.println("The area of the pentagon is " +Pentagon_area(n,s));
		
		
		

	}

}
