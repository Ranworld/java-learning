package questions;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
	
		Scanner me = new Scanner(System.in);
		System.out.println("Input p");
		double pounds =me.nextDouble();
		
		
		double d = 0.454;
		double o = d * pounds;
		System.out.println("pound convert into kg is : " + o );

	}

}
