package Programs;

import java.util.Scanner;

public class forloopeven {
public static Scanner sc;
	public static void main(String[] args) {
		int num,evennum=0;
		sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		for(int i =2;i<=num;i=i+2)
		{	
		
            evennum=evennum+i;
	}
   System.out.println(evennum);
}
}