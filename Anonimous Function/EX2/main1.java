package EX2;

public class main1 {

	public main1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
///////////////////////////////////////////////////
		MIF UU = new MIF() {
			
			@Override
			public void message() {
			
			 System.out.println("Booooooooooo");
				
			}
		};
		
		UU.message();
//////////////////////////////////////////////		
		MIF TT = ()-> System.out.println("Hooooooooooo");
		TT.message();
//////////////////////////////////////////////		
		MIF HOMO = ()-> {
			System.out.println("Hooooooooooo");
			System.out.println("Sakibara");
			System.out.println("Lun hu");
		
		
		};
		HOMO.message();      
	}

}
