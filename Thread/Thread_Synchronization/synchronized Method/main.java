package SYNK;
class Display {
	synchronized void print() {
		Thread T = Thread.currentThread();
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1080);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(T.getName());
		}
	}		
}

class T extends Thread{
	Display c;
	
	T (Display D){
		this.c = D;
	}
	
	 public void run() {
		 
		 

		c.print();
		
	}

}
public class main {

	public static void main(String[] args) {
		Display obj = new Display();
		T  EE1 =new T(obj);
		EE1.start();
		
		T  EE2 =new T(obj);
		EE2.start();
		



	}

}
