package day3;

public class DataType {

	public static void main(String[] args) {
		
		System.out.println("Max range of byte is : " + Byte.MAX_VALUE);
		System.out.println("Min range of byte is : " + Byte.MIN_VALUE);
		System.out.println("Size in bit is : " + Byte.SIZE);
		System.out.println("Size in byte is : "+ Byte.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of short is : " + Short.MAX_VALUE);
		System.out.println("Min range of short is : " + Short.MIN_VALUE);
		System.out.println("Size in bit is : " + Short.SIZE);
		System.out.println("Size in byte is : "+ Short.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of long is : " + Long.MAX_VALUE);
		System.out.println("Min range of long is : " + Long.MIN_VALUE);
		System.out.println("Size in bit is : " + Long.SIZE);
		System.out.println("Size in byte is : "+ Long.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of integer is : " + Integer.MAX_VALUE);
		System.out.println("Min range of integer is : " + Integer.MIN_VALUE);
		System.out.println("Size in bit is : " + Integer.SIZE);
		System.out.println("Size in byte is : "+ Integer.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of float is : " + Float.MAX_VALUE);
		System.out.println("Min range of float is : " + Float.MIN_VALUE);
		System.out.println("Size in bit is : " + Float.SIZE);
		System.out.println("Size in byte is : "+ Float.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of double is : " + Double.MAX_VALUE);
		System.out.println("Min range of double is : " + Double.MIN_VALUE);
		System.out.println("Size in bit is : " + Double.SIZE);
		System.out.println("Size in byte is : "+ Double.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of Character is : " + Character.MAX_VALUE);
		System.out.println("Min range of Character is : " + Character.MIN_VALUE);
		System.out.println("Size in bit is : " + Character.SIZE);
		System.out.println("Size in byte is : "+ Character.BYTES);
		
		System.out.println("========================");
		
		System.out.println("Max range of Char is : " + Character.MAX_VALUE);
		System.out.println("Min range of Char is : " + Character.MIN_VALUE);
		System.out.println("Size in bit is : " + Character.SIZE);
		System.out.println("Size in byte is : "+ Character.BYTES);
		
		System.out.println("========================");
		
		byte b1 = 127; // max range
		byte b2 = -128; // min range
		
		short s1 = 32767; // max range
		short s2 = -32768; // min range
		
		Int i1 = 2147483647; // max range
		Int i2 = -2147483648; // min range
		
		Long l1 = 9223372036854775807L; // max range
		Long l2 = -9223372036854775808L; // min range	
		
		Float f1 = 3.4028235E38F;// max range
		Float f2 = 1.4E-45F; //min range
		
		Double d1 = 1.7976931348623157E308; // max range
		Double d2 = 4.9E-324; // min range
		 
		Char c1 = 65535; // max range
		Char c2 = 0; // min range
	
	}

}
