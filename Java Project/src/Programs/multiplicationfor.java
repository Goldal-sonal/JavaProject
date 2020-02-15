package Programs;

import java.util.Scanner;

public class multiplicationfor {
public static Scanner sc;
	public static void main(String[] args) {
	int num;
	sc =new Scanner(System.in);
	System.out.println("Enter the num");
       num= sc.nextInt();
       for(int i=1;i<=10;i++)
       {
    	  
    	   int mul = num*i;
    	  System.out.println(mul); 
       }
       
	}

}
