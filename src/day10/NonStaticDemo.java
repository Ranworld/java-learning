package day10;

public class NonStaticDemo {

	// non static variable
		int a = 5;		// 1
		
		// non static method (behavior)
		public void sayHello() {   // 2
			System.out.println("Hello");
		}
		
		public static void main(String[] args) {
			NonStaticDemo non = new NonStaticDemo();
			System.out.println(non.a);         		// 1
			
			non.sayHello(); 	// 2
			
			
			
		}

	}
