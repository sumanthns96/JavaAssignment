
public class SumAtPrime extends FindPrime{
	private static int getSumAtPrime(int[] intArray) {
		boolean isPrime;
		int sum=0;
		FindPrime a=new SumAtPrime();
		for(int i=0;i<intArray.length;i++)
		{
			isPrime=a.prime(i);
			if(isPrime)
			{
				sum+=intArray[i];
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int[] Array=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		System.out.println(getSumAtPrime(Array));
		
	}

}
