package Thread_Normal_implements;

public class Main {

	public static void main(String[] args) {
		/*---RUN_1---*/
/*		
	    Child1 OB = new Child1();
	    Thread th =new Thread(OB);
	    th.start();
*/
		/*---RUN_2---*/
	    Thread th =new Thread(new Child1());
	    th.start();	
		
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
