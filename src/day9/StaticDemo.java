package day9;

public class StaticDemo {

		// static variable
		static int a = 5;		// 1
		
		// static method (behavior)
		public static void sayHello() {   // 2
			System.out.println("Hello");
		}
		
		public static void main(String[] args) {
			
			System.out.println(a);         		// 1
			
			sayHello(); 	// 2
			
			// but this is not good. Bad approach
			
			System.out.println(StaticDemo.a);
			StaticDemo.sayHello();
			
			// this is good idea.
			
		}

	}
