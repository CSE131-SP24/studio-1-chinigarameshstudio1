package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n1?");
		int n1 = in.nextInt();
		System.out.println("What is the value of n2?");
		int n2 = in.nextInt();
		double Average = (n1 + n2)/2.0;
		System.out.print(Average);
		// TODO Auto-generated method stub

	}

}
