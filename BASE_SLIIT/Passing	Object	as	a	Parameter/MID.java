

class ObjectPassDemo_Saj {
    int a, b;

    // Constructor
    ObjectPassDemo_Saj(int i, int j)
    {
        a = i;
        b = j;
    }

    // Method
    boolean equalTo(ObjectPassDemo_Saj o)
    {

        return (o.a == a && o.b == b);
    }
}

// Main class
public class MID {
    // MAin driver method
    public static void main(String args[])
    {
        // Creating object of above class inside main()
        ObjectPassDemo_Saj ob1 = new ObjectPassDemo_Saj(100, 22);
        ObjectPassDemo_Saj ob2 = new ObjectPassDemo_Saj(100, 22);
        ObjectPassDemo_Saj ob3 = new ObjectPassDemo_Saj(-1, -1);




        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
