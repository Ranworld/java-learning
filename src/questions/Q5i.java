package questions;

import java.util.Scanner;

public class Q5i {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input r");
	double r = input.nextDouble();
	
	double PI = Math.PI;
	
	double area = PI * r *r;
	System.out.println( "The circle area is :" + area);
	
	System.out.println("---------------------------------");
	
	System.out.println("Inter l:");
	double l = input.nextDouble();
	System.out.println("Inter b:");
	double b = input.nextDouble();
	
	double a = l*b;
	System.out.println("The area of rectangle is : " + a);

	System.out.println("---------------------------------");
	
	System.out.println("Inter bb:");
	double bb = input.nextDouble();
	System.out.println("Inter hh:");
	double hh = input.nextDouble();
	
	double Area = bb*hh;
	System.out.println("The area of triangle is : " + Area);


	

	}

}
