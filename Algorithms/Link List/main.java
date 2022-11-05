package main;
class EER{
	private int queArray[];
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public EER(int s) 
	{
		maxSize =s;
		queArray = new int[maxSize];
		front =0;
		rear = -1;
		nItems = 0;
	}
	public void insert(int j) 
	{
	
		if(rear == maxSize-1) {
			System.out.print("Queue is full");
		}
		else {
			queArray[++rear]=j;
			++nItems;
		}
	}
	public int remove() 
	{
		if(nItems==0) 
		{
			System.out.print("Queue is full");
			return -404;
			
		}else {
			nItems--;
			return queArray[front++];
			
		}
	}
	
	public int peekFront() 
	{
		if(nItems==0) 
		{
			System.out.print("Queue is full");
			return -404;
			
		}else {
			
			return queArray[front];
			
		}
	}
	public boolean isFull() {
		return (rear == maxSize-1);
		
	}
	
	public boolean isEmpty() {
		return (nItems==0);
		
	}		
	
}



public class main {

	public static void main(String[] args) {
		EER RR = new EER(3);
		RR.insert(23);
		RR.insert(44);
		RR.insert(99);	
		System.out.println(RR.peekFront());
		System.out.println(RR.isFull());

	}

}
