package arrays;

import java.util.Scanner;

public class Smallest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		int smallest_element = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] < smallest_element)
				smallest_element = a[j];

		}
		System.out.println("The smallest element in an array is " + smallest_element);
		sc.close();
	}

}
