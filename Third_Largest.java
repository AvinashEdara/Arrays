package arrays;

public class Third_Largest {
	public static void main(String[] args) {
		int a[] = { 8, 9, 11, 14, 6, 24, 13 };

		// sort the array
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
		System.out.println();
		System.out.println("The 3rd Largest element is " + a[a.length - 3]);
		System.out.println("The 2nd Largest element is " + a[a.length - 2]);
		System.out.println("The largest number in an array is " + a[a.length-1]);
	}
}
