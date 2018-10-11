import java.util.Scanner;

public class Assignment6 {
	public static int findFactorial(int num) {
		if(num==0)
			return 1;
		else
			return num*findFactorial(num-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int factorial=findFactorial(num);
		System.out.println(factorial);
		}

}
