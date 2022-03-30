// Java Program to Demonstrate Returning of Objects

// Class 1
class ObjectReturnDemo_SAJ {
    int a;

    // Constructor
    ObjectReturnDemo_SAJ(int i) {
        a = i;
    }

    // Method returns an object
    ObjectReturnDemo_SAJ incrByTen_Boo()
    {
        ObjectReturnDemo_SAJ temp = new ObjectReturnDemo_SAJ(a + 10);
        return temp;
    }
}

// Class 2
// Main class
public class MID {

    // Main driver method
    public static void main(String args[])
    {

        // Creating object of class1 inside main() method
        ObjectReturnDemo_SAJ ob1 = new ObjectReturnDemo_SAJ(2);
        ObjectReturnDemo_SAJ ob2;

        ob2 = ob1.incrByTen_Boo();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}
