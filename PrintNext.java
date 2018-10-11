
public class PrintNext implements Runnable {
	int i;

	public PrintNext() {
	}

	@Override
	public void run() {
		for(int i=6;i>=1;i--) {
			SharedObject so=new SharedObject();
			so.print(i);
			this.i=i;
		}	
	}

}
