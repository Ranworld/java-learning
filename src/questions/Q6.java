package questions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input radius");
		double radius = input.nextDouble();
		
		double PI = Math.PI;
		
		double C = 2* PI * radius;
		System.out.println("The perimeter of Circle is : " + C);
		
		System.out.println("-----------------------------");
		
		System.out.println("Input a");
		double a = input.nextDouble();
		System.out.println("Input b");
		double b = input.nextDouble();
		System.out.println("Input c");
		double c = input.nextDouble();
		
		double P = a + b + c;
		System.out.println("The perimeter of Triangle is : " + P);
		
		System.out.println("-----------------------------");
		
		System.out.println("Input l");
		double length = input.nextDouble();
		System.out.println("Input b");
		double breath = input.nextDouble();
		
		double Perimeter = 2 * (length +breath);
		System.out.println("The total perimeter of Rectangle is : " + Perimeter );
		
		
		
		
		

	}

}
