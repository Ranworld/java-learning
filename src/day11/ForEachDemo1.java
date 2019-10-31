package day11;

public class ForEachDemo1 {

	public static void main(String[] args) {
		int [][] arr = { {10,20,30}, {11,22,33}, {44,55,66} };
		
		for (int[] ar : arr) {
			for (int i : ar) {
		System.out.print(i + " ");
			}
		System.out.println();
		}
		

	}

}