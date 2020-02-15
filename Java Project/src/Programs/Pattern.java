package Programs;

import java.util.Scanner;

public class Pattern {
	public static Scanner sc;
	public static void main(String[] args) {
		int rows,colums,i=1;
		sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		rows=sc.nextInt();
		System.out.println("enter the colums");
		colums=sc.nextInt();
		while(i<=rows)
		{
		int	j=1;
			while(j<=colums)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println("\n");
		}

	}

}
