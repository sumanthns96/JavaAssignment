import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	private int a, b;

	public static int Add(Integer... i) {
		int sum = 0;
		for (Integer element : i) {
			sum += element;
		}
		return sum;
	}

	public static int Subtract(Integer... i) {
		int sub = 0;
		for (Integer element : i) {
			sub -= element;
		}
		return sub;
	}

	public static int Multiply(Integer... i) {
		int mul = 0;
		for (Integer element : i) {
			mul *= element;
		}
		return mul;
	}

	public static double Divide(int a, int b) {
		try {
			double div = 0.0;
			div = a / b;
			return div;

		} catch (ArithmeticException e) {
			return -1;
		}

	}

	public void read() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the two numbers:");
			a = sc.nextInt();
			b = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter an Integer Number.");
		}
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator");
		int option = 0;
		while(true) {
		System.out.println("Enter the option:\n1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE\n5.Exit");
		try {
			option = sc.nextInt();
			switch (option) {
			case 1: {
				c.read();
				int sum = Add(c.a, c.b);
				System.out.println("The sum of " + c.a + " and " + c.b + " is " + sum);
				break;
			}
			case 2: {
				c.read();
				int sub = Subtract(c.a, c.b);
				System.out.println("The subtraction of " + c.a + " and " + c.b + " is " + sub);
				break;
			}
			case 3: {
				c.read();
				int mul = Multiply(c.a, c.b);
				System.out.println("The mutiplication of " + c.a + " and " + c.b + " is " + mul);
				break;
			}
			case 4: {
				c.read();
				double div = Divide(c.a, c.b);
				if (div == -1)
					System.out.println("Denominator as zero is invalid");
				else
					System.out.println("The division of " + c.a + " and " + c.b + " is " + div);

				break;
			}
			case 5: {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid option. Enter from 1 to 4");
				break;
			}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Option");
			break;
		}
		}
	}

}
