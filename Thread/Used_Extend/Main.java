package Thread_Normal_extends;

public class Main {

	public static void main(String[] args) {
		
		Child1 er1 = new Child1();
		er1.start();

		Child2 er2 = new Child2();
		er2.start();
		
		for(int x=0 ; x<10; x++) {
			System.out.println("Child thread MAIN "+x  );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	

}
