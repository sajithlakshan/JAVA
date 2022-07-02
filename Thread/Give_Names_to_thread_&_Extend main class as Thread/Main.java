package Thread_Normal_complex;

public class Main extends Thread {

	public static void main(String[] args) {
		ChildT1 th1 = new ChildT1();
		th1.setName("Child Thread 1");
		th1.start();
		
		ChildT2 th2 = new ChildT2();
		th2.setName("Child Thread 2");
		th2.start();		
		
		Main th3 = new Main();
		th3.start();
		
		for(int x=0 ; x<5;x++) {
			System.out.println("Main Thread" +" "+ x);
			
		}		

	}
	public void run() {

		for(int x=0 ; x<5;x++) {
			System.out.println("Child Thread 3" +" "+ x);
			
		}
		
	}

}
