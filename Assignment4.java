import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment4 {
	private void Prod(int a,int b) {
		System.out.println("Product:"+a*b);
	}
	private void SquareRoot(double a) {
		System.out.println("Square Root:"+Math.sqrt(a));
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Assignment4 as=new Assignment4();
		Boolean chooseToContinue=true;
		do {
			
		try {
			
			System.out.println("Enter the 2 numbers to calculate the product of:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			as.Prod(a,b);
			System.out.println("Enter the number to calculate the Square Root of:");
			int c=scan.nextInt();
			if(c>0)
				as.SquareRoot(c);
			else
				System.out.println("Negative number not allowed");
			
			
		} catch (InputMismatchException e) {
			System.out.println("Input is incorrect");
		}
		System.out.println("Do you want to continue(Yes/No):");
		String choice=scan.next();
		if(choice.equalsIgnoreCase("No"))
			chooseToContinue=false;
		}while(chooseToContinue);
		
	}

}
