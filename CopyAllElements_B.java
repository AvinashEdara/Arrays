package arrays;

public class CopyAllElements_B {
	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55 };
		int b[] = new int[a.length];
		System.arraycopy(a, 0, b, 0, 5);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
