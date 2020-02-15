package Methods;

import java.util.Scanner;

public class minimum_no {
	static double smallest(double x, double y,double z){
		
	
   return Math.min(Math.min(x,y),z);
	}

	public static void main(String[] args) {
	
     double x,y,z;
     Scanner sc=new Scanner(System.in);
     System.out.println("x");
     x=sc.nextInt();
     
     System.out.println("y");
     y=sc.nextInt();
     
     System.out.println("z");
     z=sc.nextInt();
     System.out.println(smallest(x,y,z));
	}

}
