import java.util.Random;

public class Assignment10{

	public static void main(String[] args) {
		String[] article = {"the", "a",  "one", "some" };
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb =  {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		String output=" ";
		for(int i=0;i<20;i++)
		{
			output=(article[new Random().nextInt(4)])+" "+(noun[new Random().nextInt(4)])+" "+(verb[new Random().nextInt(4)])+" "+(preposition[new Random().nextInt(4)])+" "+(article[new Random().nextInt(4)])+" "+(noun[new Random().nextInt(4)]);
			System.out.println(Character.toUpperCase(output.charAt(0))+output.substring(1)+".");
			output=null;
		}
	}

}
