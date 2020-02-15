package Programs;

import java.util.Scanner;

public class Averege {

	public static void main(String[] args) {
		int a1,a2,a3,a4,a5;
		double per,avg,total;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the marks of s1");
		a1= s.nextInt();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the marks of s2");
		a2= s1.nextInt();
		
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter the marks of s3");
		a3= s2.nextInt();
		
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter the marks of s4");
		a4= s3.nextInt();
		
		Scanner s4= new Scanner(System.in);
		System.out.println("Enter the marks of s5");
		a5= s4.nextInt();
		
		total=(a1+a2+a3+a4+a5);
		avg  = total/5;
		System.out.println("Averege of marks is" +avg);
		per = (total / 500) *100;
		System.out.println("percentage of marks is" +per);
	}

	
	
	}


