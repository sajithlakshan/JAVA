public class INH {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(int x, int y,int Z) {
        return x + y+Z;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4, 6,10);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
