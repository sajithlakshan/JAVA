class STR{
    String GOG = "Sajith";
    double d = 56.0;
    int no = 100;
    public void gename(){
        System.out.println(GOG+" "+d+" "+no);
    }
}
////////////////////////////////////
class Array {
    public  void Instantiating_Array()
    {
        int data[];
        data = new int[10];
        data[0] = 10;

        // initialize the second elements of the array
        data[1] = 20;

        //so on...
        data[2] = 30;
        data[3] = 40;
        data[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < data.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ data[i]);
    }
}

////////////////////////////////////////////
class Stat {
    static int DOO;
    public static void Var_Method(String name)
    {
        System.out.println("Hiiiii"+" "+name+" "+DOO);
    }
    static int a=3;
    static int b;
    static void meth(int x)
    {
        System.out.println("X="+x);
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
    static
    {
        System.out.println("Static block initialized");
        b=a*4;
    }
}
//////////////////////////////////////////////////
class Fin{
    final int go =10;
    public void Can()
    {
        System.out.println("Jambu");
    }
    final public void Canot()   //Canot override
    {
        System.out.println("SUMUDU");
    }
}
class GIM extends Fin {
    public void Can(){
        System.out.println("Aba gaha");
    }


/*
    public void Canot(){
        System.out.println("Carakowita");   //Canot apply becouse final
    }
    */

}
public class MID {
    public static void main(String args[])
    {
        System.out.println("//////////STR////////////");
        STR DDR = new STR();
        DDR.gename();

        System.out.println("//////////Array//////////");
        Array Arr = new Array();
        Arr.Instantiating_Array();

        System.out.println("/////////static/////////");
        Stat.DOO=6;
        Stat.Var_Method("Yakusa");
        Stat.meth(43);

        System.out.println("////////// final////////");
        Fin FF = new Fin();
    //  FF.go =11;     //Canot assine becouse of finam variyable
        FF.Can();




    }
}
