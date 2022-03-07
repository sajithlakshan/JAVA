
class MultiThread extends Thread{
    public void run(){
      //  System.out.println("Running Thread Name: "+ this.currentThread().getName());
      //  System.out.println("Running Thread Priority: "+ this.currentThread().getPriority());
        for(int i =1; i <=5 ;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class INH {
    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread();

        MultiThread multiThread2 = new MultiThread();
        
        MultiThread multiThread3 = new MultiThread();

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();
    }
}
