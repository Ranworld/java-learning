package day4;

	// Literal : a source code representation of fixed value
// Literal :> Fixed value + Data type

// Examples : 45 Hello 34.55 Null

public class LiteralDemo {

	public static void main(String[] args) {
	
	// 1. Integer Literal 656 5654 56289 51369878 (int)
		byte b = 127;
		short s = 127;
		int i = 127;
		long l = 127;
		long l1 = 2147483647;
		long l2 = 2147483648L;
		long l3 = 5543134676876451321L;
		
	// 2. Floating literal 45.453 52.58 238.463 (double)
		  double d = 45.67;
		  float f = 45.67F;
		  
	//3. Boolean Literal true false
		  boolean b1 = true;
		  boolean b2 = false;
		  
	// 4. Character literal'Single Code' ( we cann't put 2 character) eg: ?1,#3
		  char c1 = '?';
		  char c2 = '2';
		  char c3 = '%';
		  char c4 = 'a';
		  char c5 = '\u0000'; //after u (unicode, ASCII) we need to put number of only 4 chatacter
		  char c6 = '\u0915';
		  
		  System.out.println(c6);
		  
	// 5. String Literal "Double code" eg : wefjasfj abc@456
		  String s1 = "Hello"; // any word
		  String s2 = "abc#123"; // any passowrd
		  String s3 = "a"; // any single word
		  String s4 = ""; // any blank
		  String s5 = " "; // any space
		  String s6 = "123"; // any numerical word
		  String s7 = "45.36";// any decimals numerical
		  String s8 = "I am living in USA but yo man ta mero Nepali ho.";
		  
	// 6. Null literal null
		  String s9 = null;
		  
		  LiteralDemo ob = new LiteralDemo();  // This is an object.
		  LiteralDemo obj = null;
		  // eg String ss = new string();
		  
		  // Now things to know that If :
		  // If we need Name or word = strings
		  // If we need Decimal value or any fractions  = Float or double
		  // If we need whole number or Integer number = Integer
		  // If we need any character = Character
		  // If we need true or false =  Boolean
		  
		  
		  
		  
		

	}

}
