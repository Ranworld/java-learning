package day10;


public class StaticDemo {

	// static variable
	static int a = 5;		
	
	// static method (behavior)
	public static void sayHello() {   
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);         		
		sayHello(); 	
		
		
		System.out.println(StaticDemo.a);
		StaticDemo.sayHello();
		
		
	}

}
