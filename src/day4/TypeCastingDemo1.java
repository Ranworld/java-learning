package day4;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
	
		// Implicit type-casting, Internally, convertion
	byte b = 127;
	int i = b;
	// It is by Java Compiler automatically
	// because bytes = 1 byte but integer byte is 4 (int>byte) (4>1)
	
			
	int ii = 127;
	byte bb = (byte) ii;
	
	// because of (byte) it is correct otherwise it is error.   
	
	// BUT we can put it in programe.
	// Explicit type-casting, Externally
	
	int iii = 127;
	byte bbb = (byte) iii;
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
		
		int xxx = 2;
		int yyy = 6;
		double divvv = xxx / yyy;
		System.out.println(divvv);
		// again it shows 0.0 now
		
		int xxxx = 2;
		int yyyy = 6;
		double divvvv = (double) xxxx / yyyy;
		System.out.println(divvvv);
		
	
	
	}

}
