package day12;

public class Derived extends Base{

	// hiding the variable
	String name = "derived";
	
	// overriding of method
	public void greet() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("Sweet morning from " + name);
		
	}

}
