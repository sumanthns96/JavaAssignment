import java.util.Scanner;

public class Assignment7 {
	public static boolean prime(int num) {
		boolean isPrime = true;
		int n = num;
		int i = 2;
		if (num == 1)
			System.out.println("Is a neither Prime nor Composite");
		while (i <= n / 2) {
			if (num % i == 0)
				isPrime = false;
			i++;
		}
		return isPrime;

	}

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num==0)
		{
			System.out.println("Enter a natural number");
		}
		System.out.println("The number is a Prime Number:" + prime(num));

	}
}
