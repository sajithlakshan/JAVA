package Synchronization;

public class Document {
	public synchronized void update(Document ob) {
		
		for(int x=0;x<10;x++)
		{
			System.out.println("Updata the document"+x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
