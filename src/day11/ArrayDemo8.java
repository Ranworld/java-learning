package day11;

public class ArrayDemo8 {

	public static void main(String[] args) {
		

		int[] arr = {15,66,26,56,23,22,62,45,85};
		
		int sum =0;
		
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
//Enhanced for loop	(foreach)