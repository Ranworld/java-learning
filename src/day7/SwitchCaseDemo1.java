package day7;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inter your choice");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1:
		case 2:
			System.out.println("weekend");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Its working day");
			break;
		case 7:
			System.out.println("It's friday night - Let's go to party.");
		default:
			System.out.println("wrong input");
		}
		

	}
	

}
