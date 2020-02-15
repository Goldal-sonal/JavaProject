package Programs;

import java.util.Scanner;

public class vowelss {
	private static Scanner sc;
	public static void main(String[] args) {
		char ch= 'o';
		sc = new Scanner(System.in);
		System.out.println("Enter the vowels");
		ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		System.out.println("char is vowel");
		break;
		
		case 'e':
		System.out.println("char is vowel");
		break;
		
		case 'i':
		System.out.println("char is vowel");
		break;
		
		case 'o':
		System.out.println("char is vowel");
		break;
		
		case 'u':
		System.out.println("char is vowel");
		break;
		default:
			System.out.println("Invalid");
			
		}		
			
		
		
		}

}
