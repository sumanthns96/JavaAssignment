
public class SharedObject {

	synchronized public void print(int i) {
		notify();
		System.out.println(i);
		try {wait(10);} catch (InterruptedException e) {}
	}

}
