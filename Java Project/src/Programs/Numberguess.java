package Programs;

import java.util.Scanner;

public class Numberguess {

	public static void main(String[] args) {
		{

			int win =55;
			int num;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number");
			num = s.nextInt();
			if(num==win )
			{
				System.out.println("win");
			}
			else
			{
				if(num>win){
					System.out.println("gretter");

				}
				else
				{
					System.out.println("lesser");
				}
			}

		}

	}
}
