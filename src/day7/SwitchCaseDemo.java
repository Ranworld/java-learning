package day7;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = input.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println("addition");
			break;

		case 2:
			System.out.println("subtraction");
			break;
		case 3:
			System.out.println("division");
			break;
		case 4:
			System.out.println("multiplication");
			break;
		
		default:
			System.out.println("wrong input");
		}
		
		System.out.println("rest of code");

	}
	

}
