package Programs;

import java.util.Scanner;

public class gameguessing {
	public static Scanner sc;

	public static void main(String[] args) {
		boolean a=true;
		int winnernum=30,usernum;
		sc=new Scanner(System.in);
		usernum = sc.nextInt();

		System.out.println("Enter the number");
		while(a)
		{
			if(winnernum==usernum)
			{
				System.out.println("yeeeeee winn,,!!!!");
				a=false;
			}
			else{
				if(usernum>winnernum)
				{
					System.out.println("greter number");
					System.out.println("guess again");
					usernum=sc.nextInt();
				}
				else{
					System.out.println("lesser number");
					System.out.println("guess again");
					usernum=sc.nextInt();
				}
			}

		}
	}
}