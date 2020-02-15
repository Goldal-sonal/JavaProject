package Programs;

import java.util.Scanner;

public class ladderelseif {

	public static void main(String[] args){
		int marks;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		marks = s.nextInt();
		if(marks>=75 && marks<100 )
		{
			System.out.println("Grade A" );
		}
		else if(marks>=60 && marks <=75)
		{
			System.out.println("Grade B");
		}
		 else if(marks>=45 && marks<=60)
		 {
			System.out.println("Grade C"); 
	}
		 else
		 {
			 System.out.println("fail");
}


	




	}

}
