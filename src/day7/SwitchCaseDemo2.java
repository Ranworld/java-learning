package day7;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = input.next().charAt(0);
		
		
		switch (choice) {
		case '+':
			System.out.println("addition");
			break;

		case '-':
			System.out.println("subtraction");
			break;
		case '/':
			System.out.println("division");
			break;
		case '*':
			System.out.println("multiplication");
			break;
		
		default:
			System.out.println("wrong input");
		}
		
		System.out.println("rest of code");

	}
	

}
