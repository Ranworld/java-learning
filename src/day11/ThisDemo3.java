package day11;

public class ThisDemo3 {

	//instance variable
	int a = 5;
	
	public void show() {
		System.out.println(a);
		//local variable
		
		int a = 4;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		ThisDemo3 obj = new ThisDemo3();
		obj.show();

	}

}
