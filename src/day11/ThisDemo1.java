package day11;

public class ThisDemo1 {

String name;
	
	public ThisDemo1(String name) {
	this.name = name;
		
	}
	public void printinfo() {
		System.out.println("Name is : " + name);
	}
	
	
	public static void main(String[] args) {
		ThisDemo ob = new ThisDemo("Untim");
		ob.printinfo();
		 

	}

}
