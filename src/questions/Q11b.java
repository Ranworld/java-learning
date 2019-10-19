package questions;

public class Q11b {

	public static void main(String[] args) {
	
	// without temp variable
		
	int i = 10;
	int ii = 20;
	
	System.out.println(i);
	System.out.println(ii);
	
	System.out.println("-----------------------");
	
	i = i + ii;
	ii = i - ii;
	i = i - ii;
	
	System.out.println(i);
	System.out.println(ii);
	
			

	}

}
