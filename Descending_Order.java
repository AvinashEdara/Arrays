package arrays;

import java.util.Scanner;

public class Descending_Order {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp = 0;
		for (int k = 0; k < a.length; k++) {
			a[k] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m] + " ");

		}
		sc.close();

	}

}
