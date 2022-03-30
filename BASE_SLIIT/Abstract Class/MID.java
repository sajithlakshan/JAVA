abstract  class Nimal   //Canot create object to abstract Class
{
    abstract  void run();

}

class Kamal extends Nimal{
    void run()
    {
        System.out.println("Fast");
    }
}
public class MID {

    // Main driver method
    public static void main(String args[])
    {
        Kamal OB1 = new Kamal();
        OB1.run();

    }
}
