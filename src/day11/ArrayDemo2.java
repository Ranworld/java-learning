package day11;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		// array is a collection(group) of elements of same data type 
		// aranged in a sequential manner.
		
		int [] arr = new int[3];
		System.out.println(arr.length);
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter elements: ");
			arr[i] = input.nextInt();
			
		}
		
		 
		 int sum = arr[0]+arr[1]+arr[2];
		System.out.println(sum);

	}

}
// single dimensional array 
