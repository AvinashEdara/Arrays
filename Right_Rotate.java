package arrays;

import java.util.Scanner;

public class Right_Rotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		int num_of_times = sc.nextInt();
		for (int i = 0; i < num_of_times; i++) {

			int temp = a[a.length-1];
			for (int k = a.length - 1; k > 0; k--) {
				a[k] = a[k - 1];
			}
			a[0] = temp;

			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			sc.close();
		}
	}

}
