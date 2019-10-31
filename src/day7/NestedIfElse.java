package day7;

public class NestedIfElse {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 6;
		int c = 7;
		
		if (a>b) {
			if (a>c) {
				System.out.println("a is greatest one");
		}
			else {
				System.out.println(" c is greatest one");
			}
		} 
			else {
			System.out.println("may be b or c greater than a");
			
		}
		 	System.out.println("rest of code");
	}

}
