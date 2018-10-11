
public class Assignment5 {

	public static void main(String[] args) {
		char[] charArray = new char[] { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
		char[] reverseArray= new char[charArray.length];
		int j=0;
		System.out.println(charArray.length);
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseArray[j]=charArray[i];
			j+=1;
		}
		System.out.println(reverseArray);
	}

}
