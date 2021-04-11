package arrays;

import java.util.Arrays;

public class FrequencyOfEachElement {

	// https://www.youtube.com/watch?v=-E06o0k1kHs
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j])
					count++;
				else
					break;
			}
			if (count > 1) {
				System.out.println(a[i] + "----- " + count + " times");
				i = i + count - 1;
			}
		}

	}
}
