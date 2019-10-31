package day12;

public class Test {

	public static void main(String[] args) {
	
		Parent ob = new Parent(); // this is call from Parent
		System.out.println(ob.name);  // variable
		ob.greet(); // method

		Child obj = new Child(); // this is call from child
		System.out.println(obj.name);
		obj.greet();
	}

}
