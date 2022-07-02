package Thread_Normal_complex;

public class ChildT2 extends Thread {
	public void run() {

		for(int x=0 ; x<5;x++) {
			System.out.println(Thread.currentThread().getName() +" "+ x);
			
		}
		
	}
	
	
	

}
