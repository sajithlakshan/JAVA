package Synchronization;

public class ChildT1 extends Thread {
	
	Document ob;
	
	
	public ChildT1(Document ob) {
		super();
		this.ob = ob;
	}


	public void run() {

		ob.update(ob);
		
	}

}
