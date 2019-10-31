package questions;

import java.util.Scanner;

public class Q10a {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inter u:");
		double u = input.nextDouble();
		System.out.println("inter a:");
		double a = input.nextDouble();
		System.out.println("Inter t:");
		double t = input.nextDouble();
		
		double s = u* t* 0.5*a*t*t;
		System.out.println("S is " + s);
		
		
	
	
	

	}

}
