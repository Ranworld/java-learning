package day11;

public class ArrayDemo4 {

	public static void main(String[] args) {
	
		int[] arr = {15,66,26,56,23,22,62,45,85};
		
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
//single dimensional array