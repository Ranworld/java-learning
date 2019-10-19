package questions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inter Principle");
		double Principle = input.nextDouble();
		
		System.out.println("Inter Time");
		double Time = input.nextDouble();
		
		System.out.println("Rate");
		double Rate = input.nextDouble();
	
		double SI = (Principle * Time * Rate ) / 100;
		System.out.println("Simple Interest : " + SI);
		
		
		

	}

}
