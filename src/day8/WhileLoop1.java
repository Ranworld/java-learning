package day8;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean flag = true;
	while (flag) {
	System.out.println("Enter Name : ");
	String name = input.next();
	
	if(name.equals("Ranjit")) {  /* if we use this then it gonna to stop it 
		otherwise we have to write a lot of uncertainty name. */
		flag = false;
		
	}
	}

}
}
