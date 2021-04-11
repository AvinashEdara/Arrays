package arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Count_Occurances {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int k = 0; k < size; k++) {
			a[k] = sc.nextInt();
		}
		LinkedHashMap<Integer, Integer> lhmap = new LinkedHashMap<Integer, Integer>();
		int i = 0;
		while (i < size) {
			if (lhmap.containsKey(a[i]) == false) {
				lhmap.put(a[i], 1);
			} else {
				int old_value = lhmap.get(a[i]);
				int new_value = old_value + 1;
				lhmap.put(a[i], new_value);
			}
			++i;
		}
		Set<Map.Entry<Integer, Integer>> lmap = lhmap.entrySet();
		for (Map.Entry<Integer, Integer> data : lmap) {
			System.out.println(data.getKey() + "-" + data.getValue()+" times");
			//System.out.println(data.getValue());
		}
		sc.close();
	}
}
