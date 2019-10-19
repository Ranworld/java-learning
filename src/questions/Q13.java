package questions;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter roll : ");
		int roll = input.nextInt();
		System.out.println("Enter Name : ");
		String name = input.next();
		System.out.println("Enter Nationality : ");
		String Nationality = input.next();
		
		System.out.println("-----------------------");
		
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Nationality is : " + Nationality);
		
		System.out.println("-------------------------");
		

	}

}
