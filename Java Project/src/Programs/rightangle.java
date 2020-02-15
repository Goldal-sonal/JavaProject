package Programs;

import java.util.Scanner;

public class rightangle {
public static Scanner sc;
	public static void main(String[] args) {
		int row,j=1,i=1;
		sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		row=sc.nextInt();
		while(i<=row)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.print("\n");
		}
			
		
		

	}

}
