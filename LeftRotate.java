package arrays;

import java.util.Scanner;

public class LeftRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int num_of_times = sc.nextInt();
		for (int i = 0; i < num_of_times; i++) {
			int first = a[0];
			for (int k = 0; k < a.length - 1; k++) {

				a[k] = a[k + 1];
			}
			a[a.length - 1] = first;
			sc.close();

			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			//System.out.println();
		}
	}

}
