class OVER {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(int x, int y, int Z) {
        return x + y + Z;
    }

}
public class INH {
    public static void main(String[] args) {
        OVER EEW = new OVER();
        System.out.println(EEW.plusMethod(2,3));
        System.out.println(OVER.plusMethod(2,3,100));

    }
}
