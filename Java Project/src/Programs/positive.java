package Programs;

import java.util.Scanner;

public class positive {
	public static void main(String[] args){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no");
		num =s.nextInt();
		if(num>0)
		{
			System.out.println("yes!number is possitive");
		}
		else{
			System.out.println("yes! number is negetive");
		}
	}

}
