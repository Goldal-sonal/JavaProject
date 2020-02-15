package Programs;

import java.util.Scanner;

public class array1_calculation {
private static Scanner sc;
	public static void main(String[] args) {
		int size,i;
		sc=new Scanner(System.in);
		System.out.println("please enter size of array:");
		size=sc.nextInt();
		int []a=new int[size];
		int []b=new int[size];
		int [] Addition = new int[size];
		int [] Substraction=new int[size];
		int [] Multiplication =new int[size];
		int [] Division=new int[size];
		float [] Module=new float[size];
		System.out.println("please Enter "+size+ " element of an array");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("please enter "+size+" element of an array");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			Addition [i]= a[i]+b[i];
			
			Substraction [i]= a[i]-b[i];
			Multiplication [i]= a[i]*b[i];
			Division[i]= a[i]/b[i];
			Module [i]=a[i]%b[i];
		}
		System.out.println("\nAdd\tsub\t mul\t div\t mod");
		
		for(i=0;i<size;i++)
		{
			System.out.println(+Addition[i]+"\t"+Substraction[i]+"\t"+Multiplication[i]+"\t"+Division[i]+"\t"+Module[i]+"\t");
		System.out.println();
			 
		}
	}
}