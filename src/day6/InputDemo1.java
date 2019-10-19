package day6;

import java.util.Scanner;

public class InputDemo1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// In this case if you write your full name then it will only type first word.
	System.out.println("Enter Name : ");
	String Name = input.next();
	System.out.println("Name is : " + Name);
	
	// SO that for full name you need to cnange input.nextLine()
	
	System.out.println("Enter Naam : ");
	String Naam = input.nextLine();
	System.out.println("Naam is : " + Naam);
	
	
	// Note: you need to delete first case for full name.
	// so that for first word you need to use next and and for full you need to use nextLine
	
	
	// for character
	
	System.out.println("Enter any character;: ");
	char ch = input.next().charAt(0);
	System.out.println("Entered character is : " + ch);
	
	}
		
	}
