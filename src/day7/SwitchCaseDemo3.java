package day7;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice = input.next();
		
		
		switch (choice) {
		case "add":
			System.out.println("addition");
			break;

		case "sub":
			System.out.println("subtraction");
			break;
		case "div":
			System.out.println("division");
			break;
		case "mul":
			System.out.println("multiplication");
			break;
		
		default:
			System.out.println("wrong input");
		}
		
		System.out.println("rest of code");

	}
	

}
