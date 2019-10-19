package day6;

public class SwapDemo1 {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 6;
		
	System.out.println("Before swapping a is : " + a);
	System.out.println("Before swapping b is : " + b);

	a = a + b; // 11
	b = a - b; // 6
	a = a - b; // 5
	
	System.out.println("After swapping a is : " + a);
	System.out.println("After swapping b is : " + b);


	
	}

}
