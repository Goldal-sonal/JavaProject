package Programs;

import java.util.Scanner;

public class Array_1scanner {

	public static void main(String[] args) {
	int total=0,size;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of array");
	size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter all element of array");
	for(int i=0;i<arr.length;++i)
	{
		arr[i]=s.nextInt();
		total=total+arr[i];
		
	}
	System.out.println("Total is:"+total);
	

	}

}
