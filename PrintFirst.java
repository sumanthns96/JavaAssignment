
public class PrintFirst implements Runnable {
int i;

	public PrintFirst() {
	}

	@Override
	public void run() {
		for(int i=8;i<=13;i++) {
			SharedObject so=new SharedObject();
			so.print(i);
			this.i=i;
		}	
		
	}

}
