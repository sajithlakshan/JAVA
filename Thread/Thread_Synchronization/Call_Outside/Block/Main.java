package Synchronization;

public class Main  {

	public static void main(String[] args) {
		Document ob = new Document();
		ChildT1 ob1 = new ChildT1(ob);
		ChildT2 ob2 = new ChildT2(ob);
		ob1.start();
		ob2.start();
		
		

	}


}
