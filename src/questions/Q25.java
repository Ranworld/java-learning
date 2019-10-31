package questions;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n = sc.nextInt();
		
		String name = null;
		int maxScore=0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter name");
			String na = sc.next();
			System.out.println("Enter score");
			int score = sc.nextInt();
			if(score>maxScore) {
				maxScore = score;
				name = na;
			}
			
		}
		System.out.println("Student name is : " + name);
		System.out.println("Maxscore is : " + maxScore);

	}

}
