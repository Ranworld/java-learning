package questions;

import java.util.Scanner;

public class Q10c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inter a:");
		double a = input.nextDouble();
		System.out.println("Inter b:");
		double b = input.nextDouble();
		System.out.println("Inter c:");
		double c = input.nextDouble();
		
		double x = (-b + Math.sqrt(b*b-4*a*c)) / 2*a;
		System.out.println("x is :" + x);
		

	}

}
