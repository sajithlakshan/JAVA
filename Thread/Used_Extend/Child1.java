package Thread_Normal_extends;

public class Child1 extends Thread{
	public void run() {
		for(int x=0 ; x<10; x++) {
			System.out.println("Child thread 1 "+x  );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}