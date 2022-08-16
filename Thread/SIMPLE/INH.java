package SLIIT;

public class INH {

	public static void main(String[] args) {
		C1 DD = new C1();
		DD.start();
		for(int i = 0; i <10 ;i++) {
			System.out.println("Main Thread : "+i);
			
		}		
	}

}
