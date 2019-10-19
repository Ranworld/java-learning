package questions;

public class Q11a {

	public static void main(String[] args) {
		
	// using temp variable
	int i = 10;
	int ii = 20;
	
	System.out.println(i);
	System.out.println(ii);
	
	System.out.println("----------------------");
	
	int temp = i;
	i = ii;
	ii = temp;
	
	System.out.println(i);
	System.out.println(ii);
	

	}

}
