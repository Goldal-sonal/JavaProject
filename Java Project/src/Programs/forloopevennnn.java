package Programs;

import java.util.Scanner;

public class forloopevennnn {
public static Scanner sc;
	public static void main(String[] args) {
		int num;
		
		sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int evennum=0;
		for(int i=2;i<=num;i=i+2)
		{
			evennum=evennum+i;
		}
		System.out.println(evennum);
          
	}

}
