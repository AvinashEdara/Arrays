package arrays;

import java.util.Scanner;

public class Number_Of_Elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println("Number of Elements in an array is " + a.length);
		sc.close();

	}

}
