package day11;

public class ThisDemo2 {

	public void setName(String name) {
		this.name = name;
				
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
	ThisDemo2 ob = new ThisDemo2("Ram");
	System.out.println("ob.getName());"
	
			
	ThisDemo2 obj = new ThisDemo2("shyam");
	obj.setName("shyam");
	System.out.println("obj.getName());"
		
	}

}
