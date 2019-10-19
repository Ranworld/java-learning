package day4;

public class TypeCastingDemo4 {

	public static void main(String[] args) {
	
		// for garbage value
		
		double d = 126.50;
		byte b = (byte) d;
		
		System.out.println(d);
		System.out.println(b);
		
		// its correct 
		
		double dd = 128.50;
		byte bb = (byte) dd;
		
		System.out.println(dd);
		System.out.println(bb);
		
		// this is garbage value (-128.5)
		
		// there is any type casting in boolean
		
		
	}

}
