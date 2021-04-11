package arrays;

public class Second_Smallest {
	public static void main(String[] args) {
		int a[] = { 8, 9, 11, 14, 6, 24, 13 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		for (int m = 0; m < a.length; m++) {
			if (m == 1) {
				//System.out.println();
				System.out.println("The second smallest element is " + a[m]);
			}
			if (m == 0) {
				System.out.println();
				System.out.println("The  smallest element is " + a[m]);
			}
		}
	}
}
