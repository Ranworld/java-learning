package questions;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number between 0 to 127");
	int n = input.nextInt();
	
	if (n>=0 && n<=127) {
		char c = (char)n;
		System.out.println("Corresponding ASCII code is : " + c);
		}else {
			System.out.println("The number is not in range ");
			
		}
	}

}
