public class Assignment11 {
public static void main(String[] args) {
	
	
		Runnable pf = new PrintFirst();
		new Thread(pf).start();
		try {Thread.sleep(2);} catch (InterruptedException e) {}
		Runnable pn = new PrintNext();
		new Thread(pn).start();
	}
}

