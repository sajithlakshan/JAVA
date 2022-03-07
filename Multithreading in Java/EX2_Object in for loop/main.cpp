class MultiThread extends Thread{
    public void run(){

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

        for (int i = 0; i <= 3 ; i++)
        {
            MultiThread multiThread = new MultiThread();
            multiThread.start();
        }

    }
}
