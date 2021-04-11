package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		HashSet<Integer> hset = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hset.add(arr[i]);
		}
		for (Integer a : hset)
			System.out.print(a + " ");
		sc.close();
	}
}
