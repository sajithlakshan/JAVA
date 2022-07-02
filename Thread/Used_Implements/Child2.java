package Thread_Normal_implements;

public class Child2 extends Thread{
	public void run() {
		for(int x=0 ; x<10; x++) {
			System.out.println("Child thread 2 "+x  );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
