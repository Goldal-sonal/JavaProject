package Programs;

import java.util.Scanner;

public class oddnos {
    static Scanner sc;
	public static void main(String[] args) {
		int num,i=1;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter any number");
		num = sc.nextInt();
		
		while(i<=num){
		
        System.out.println(i);
        i=i+2;
		}
	}
}	


