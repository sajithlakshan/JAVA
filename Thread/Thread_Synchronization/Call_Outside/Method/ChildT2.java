package Synchronization;

public class ChildT2 extends Thread {
	Document ob;
	
	
	public ChildT2(Document ob) {
		super();
		this.ob = ob;
	}


	public void run() {

		ob.update(ob);
		
	}
	
	
	

}
