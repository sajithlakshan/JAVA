package SYNK;
class Display {
	void print() {
		System.out.println("Yoooooooooooooooooooo");
	}
		
}

class T {
	Display c;
	
	T (Display D){
		this.c = D;
	}
	
	 void runs() {
		
		c.print();
		
	}

}
public class main {

	public static void main(String[] args) {
		Display DD = new Display();
		T  EE =new T(DD);
		EE.runs();


	}

}
