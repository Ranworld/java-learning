package day9;

public class Student {

	String name;
	int roll;
	
	// set
	
	public void assignValue(String n, int r) {
		name = n;
		roll = r;
		
	}
	
	public void displayInfo() {
		
		// Get
		System.out.println("name is : " + name);
		System.out.println("roll is : " + roll);
	}
	
}
