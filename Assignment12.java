public class Assignment12 extends FindPrime {

	public static void main(String[] args) {

		int i = 2;
		int square;
		boolean repeat = true;
		while (true) {
			square = 0;
			if (prime(i)) {
				square = i * i;
				if (square > 900)
					repeat = false;
				if (repeat)
					System.out.println(square);
				else
					System.exit(0);
			}
			i++;
		}
	}

}