package day10;

public class MethodDemo {

	// Method define
	public void sayHello() {
		System.out.println("HELLO-BROTHER");
	}
	
	public void printinfo (String name, int age) {
		System.out.println("name is : " + name);
		System.out.println("age is : " + age);
	}
	
	public static void main(String[] args) {
		
		// call
		System.out.println("Main start");
		MethodDemo obj = new MethodDemo();
		obj.sayHello();
		
		obj.printinfo("Nirmal", 25);
		//or string name = "Nirmal" ;
		// or int age = 25;
		System.out.println("Main end");
		
		
		}
		


}
