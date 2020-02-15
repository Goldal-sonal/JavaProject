package Programs;

import java.util.Scanner;

public class Arayposnegno {
private static Scanner sc;
	public static void main(String[] args) {
		int size;int countpos=0;
		int countneg=0;
		sc=new Scanner(System.in);
		System.out.println("Enter the element");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("please Enter "+size+ " element of an array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>0)
			{
				countpos++;
			}
			else
			{
				countneg++;
			}
			}
			System.out.println("positive no is:" +countpos);
			System.out.println("negetive no is:" +countneg);
			
		}
		

}	

