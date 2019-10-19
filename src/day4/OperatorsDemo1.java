package day4;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		
	// Arithmetic Operators  : + - * / % (modulus) 
		
		// Precedence ( Priority : / * % (High) + - (Low)
		// Associativity : left to right 
		
		
		System.out.println(7 / 3); // It gives quotient
		System.out.println(7 % 3); // It gives remainder
		
		System.out.println("==================");
		
		int a = 4 + 5 - 6 / 2 - 3 * 2 + 7 % 3 ; 
		// lets see how it calculate:
		
		a = 4 + 5 - 3 - 3 * 2 + 7 % 3 ;
		a = 4 + 5 - 3 - 6 + 7 % 3 ;
		a = 4 + 5 - 3 - 6 + 1 ;
		a = 9 - 3 - 5 ;
		a = 1 ;
		
		
		
		System.out.println(a);
		
		
				

	}

}
