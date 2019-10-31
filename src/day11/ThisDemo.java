package day11;

public class ThisDemo {

	String name;
	
	public ThisDemo(String n) {
	name = n;
		
	}
	public void printinfo() {
		System.out.println("Name is : " + name);
	}
	
	
	public static void main(String[] args) {
		ThisDemo ob = new ThisDemo("Untim");
		ob.printinfo();
		

	}

}
