package arrays;

//import java.util.Arrays;

public class Largest_Element {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 18, 47, 17, 40 };

		int largest_Value = a[0];

		for (int i = 0; i < a.length; i++) {
			if (largest_Value < a[i])
				largest_Value = a[i];
		}
		System.out.println(largest_Value);

//		Arrays.sort(a);
//		System.out.println(a[a.length-1]);
	}

}
