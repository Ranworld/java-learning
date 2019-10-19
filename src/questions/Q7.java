package questions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radious");
		double radius = input.nextDouble();
		System.out.println("Enter length");
		double height = input.nextDouble();
		
		double PI = Math.PI;
		
		double volumes = PI* radius* radius* height;
		System.out.println("The volume of cylinder is : " + volumes);
		
		
		
		
		
				
		
		
		
		
		

	}

}
