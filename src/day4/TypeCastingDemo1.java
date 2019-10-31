package day4;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
	
		// Implicit type-casting, Internally, conversion
	byte b = 127;
	int i = b;
	// It is by Java Compiler automatically
	// because bytes = 1 byte but integer byte is 4 (int>byte) (4>1)
	
			
	int i1 = 127;
	byte b1 = (byte) i1;
	
	// because of (byte) it is correct otherwise it is error.   
	
	// BUT we can put it in programme.
	// Explicit type-casting, Externally
	
	int i2 = 127;
	byte b2 = (byte) i2;
	// It is by programmer forcefully

	//example
		int x = 6;
		int y = 2;
		int div = x / y;
				System.out.println(div);
				
		// suppose
		int xx = 2;
		int yy = 6;
		int divv = xx / yy;
		System.out.println(divv);
		// THe answers should be 0.3 but it shows only 0 thats why
		
		// using of double
		int xxx = 2;
		int yyy = 6;
		double divvv = xxx / yyy;
		System.out.println(divvv);
		// again it shows 0.0 now
		
		// using both side double
		int r = 2;
		int t = 6;
		double div1 = (double) r / t;
		System.out.println(div1);
		
	
	
	}

}
