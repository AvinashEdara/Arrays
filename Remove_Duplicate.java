package arrays;

public class Remove_Duplicate {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 5, 5 };
		int temp[] = new int[a.length];
		int j = 0;
		int length = a.length;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i + i]) {
				temp[j++] = a[i];

			}
		}
		temp[j++] = a[length - 1];
		for (int k = 0; k < j; k++) {
			System.out.println(temp[k] + " ");
		}
	}

}
