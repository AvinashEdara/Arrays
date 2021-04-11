package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Equal_GivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int k = 0; k < size; k++) {
			a[k] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			if (a[low] + a[high] > sum)
				high--;
			else if (a[low] + a[high] < sum)
				low++;
			else if (a[low] + a[high] == sum)
				System.out.println(a[low] + "," + a[high]);
			low++;
			high--;
		}
		sc.close();
	}
}
