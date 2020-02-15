package Programs;

import java.util.Scanner;

public class printnumfor {



	public static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		int k=1; // 2 4 5 6 7

		for(int i=1;i<=row;i++)// 1<=4 2<=4 3<=4 4<=4
		{


			for(int j=1;j<=i;j++) // 1<=1 2<=1, 1<=2 2<=2 3<=2, 1<=3 2<=3 3<=3 4<=3, 1<=3 2<=3 3<=3 4<=3 4<=4 5<=4
			{
				System.out.print(k); // 1 2,3 4,5,6 7,8,9,10
				k++; // 2 3 4 5 6 7 8 9 10
			}
			System.out.println();
		}


	}



}


