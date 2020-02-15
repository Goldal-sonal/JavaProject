package Programs;

import java.util.Scanner;

public class Profitloss {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		if(num>100 )
		{
			System.out.println("profit");
		}
		else
			System.out.println("loss");

	}

}


	