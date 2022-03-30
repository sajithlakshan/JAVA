class OL{
    void teat()
    {
        System.out.println("No parameter");
    }
    void teat(int a)
    {
        System.out.println("A="+a);
    }
    void teat(int a, int b)
    {
        System.out.println("A="+a+" B="+b);
    }
    void teat(double b)
    {
        System.out.println("Double b ="+b);
    }
}
public class MID {

    // Main driver method
    public static void main(String args[])
    {
        OL kk = new OL();
        kk.teat();
        kk.teat(10);
        kk.teat(2.9);
        kk.teat(10,20);

    }
}
