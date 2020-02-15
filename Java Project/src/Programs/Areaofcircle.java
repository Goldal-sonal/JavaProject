package Programs;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
	float pi=3.14f;
	double area;
	int r;
	Scanner s= new Scanner(System.in);
	System.out.print("enter the redius: ");
	r =s.nextInt();
	area =pi*r*r;
	System.out.println(area);

	}

}
