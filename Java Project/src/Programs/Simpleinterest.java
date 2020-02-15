package Programs;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		double si,p,r,t;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the principle amount");
		p= s.nextDouble();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the rate of interest");
		r= s1.nextDouble();
		
		
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter the time");
		t= s2.nextDouble();
		
		si=(p+r+t)/100;
		System.out.println("simple interest is" +si);

	}

}
