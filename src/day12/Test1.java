package day12;

public class Test1 {

	public static void main(String[] args) {
		
		Base ob = new Base();
		System.out.println(ob.name);
		ob.greet();
		
		System.out.println("==========");
		
		Derived obj = new Derived();
		obj.greet();
		

	}

}
