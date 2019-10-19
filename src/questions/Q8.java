package questions;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Input F");
		double Fahrenheit = input.nextDouble();
		
		double Degree = ((32* Fahrenheit) - 32) * ((double)5/9);
		System.out.println("The Fehrenheit is change to Celcius is: " + Degree);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Input C");
		double Celcius = input.nextDouble();
		
		double Degree1 = (Celcius * 9/5) + 32;
		System.out.println("The Celcius is change to Fehrenheit is :" + Degree1);

	}

}
