package Programs;

import java.util.Scanner;

public class Swapping2no {

	public static void main(String[] args) {
		int min,max,temp;
		Scanner s=new Scanner (System.in);
		System.out.println("enter the minimum value");
		min=s.nextInt();
		
		Scanner s1=new Scanner (System.in);
		System.out.println("enter the maximum value");
	    max=s1.nextInt();
	    
	          temp=max;
	          max=min;
	          min=temp;
	          System.out.println("min=" +min);
	  	    System.out.println("max=" +max);
	          

	}

}
