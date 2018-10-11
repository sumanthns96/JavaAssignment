
public class Assignment1 {

	public static void main(String args[]) {
		int n = 6;
		int k = 2 * n - 1;
		//first half
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 1;
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		k = k - 1;
		int m=1;
		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			++m;
				for (int j = 0; j < i + m; j++) {
					System.out.print("* ");
				}
			System.out.println();
		}

	}
}