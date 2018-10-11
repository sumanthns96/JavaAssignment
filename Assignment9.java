import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		Roman(num);
	}

	public static void Roman(int num) {

		if (num > 1000) {

			for (int i = 0; i < num / 1000; i++)
				System.out.print("M");
			num = num % 1000;
			Roman(num);
		} else {
			if (num > 500) {
				if(num>=900) {
					System.out.print("CM");
					num=num%900;
				}
				else {

					System.out.print("D");
					num = num % 500;
				}
				
				Roman(num);
			} else {
				if (num > 100) {
					if (num >= 400) {
						System.out.print("CD");
					} else {

						for (int i = 0; i < num / 100; i++)
							System.out.print("C");

					}
					num = num % 100;
					Roman(num);
				} else {
					if (num > 50) {
						if (num >= 90) {
							System.out.print("XC");
							num=num%90;
						} else {

							System.out.print("L");
							num = num % 50;
						}
							Roman(num);
					} else {

						if (num > 10) {
							if (num >= 40)
								System.out.print("XL");
							else {
								for (int i = 0; i < num / 10; i++)
									System.out.print("X");

							}
							num = num % 10;
							Roman(num);
						} else {
							if (num == 9)
								System.out.print("IX");
							else if (num == 4)
								System.out.print("IV");
							else {
								
								if(num/5==1 && num%5==0)
									System.out.print("V");
								else {
									if(num>5)
										System.out.print("V");
									num = num % 5;
									for (int i = 0; i < num; i++)
										System.out.print("I");
								}
									

							}
						}
					}
				}
			}
		}
	}

}
