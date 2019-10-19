package day4;

public class TypeCastingDemo3 {

	public static void main(String[] args) {
	double d = 127;
	float f = (float) d;
	// if only put f=d its an error now after using (float) its correct.
	
	long l = (long) f;
	// it is same as above.
	
	int i = (int) l;
	short s = (short) i;
	byte b = (byte) s;
	
	System.out.println(d);
	System.out.println(f);
	System.out.println(l);
	System.out.println(i);
	System.out.println(s);
	System.out.println(b);
	
	
	

	}

}
