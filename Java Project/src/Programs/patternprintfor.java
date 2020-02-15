package Programs;

import java.util.Scanner;

public class patternprintfor {
	public static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		
		System.out.println("enter colum");
		int colum=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=colum;j++)
			{
				System.out.print(" *");
			
			}
			System.out.println();
		}
	}
}
