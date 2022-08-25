package Ex1;

import java.util.Stack;

public class main {

	public static void main(String[] args) {
		Cat C =new Cat();
		C.print();
		
		printTHing(C);
		/*
		 * 
		printTHing(
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Miyau");
				
			}			
		);
///////////////////////////////////////////////////////
 * 		printTHing(() {
				
				System.out.println("Miyau");
				
			}			
		);

		 * */
		
		printTHing(()->{
			System.out.println("10");
		});
		printTHing(()-> System.out.println("11"));
		
		
		Printable klk = ()-> System.out.println("12");
		printTHing(klk);
		
	}
	
	
	static void printTHing(Printable thing) {
		thing.print();
	}

}
