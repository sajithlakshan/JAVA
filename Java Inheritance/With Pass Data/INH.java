class Vehicle {
     String brand;
     String Gos ;
     String Park = "OK";
     private String breal = "DDR";
    public void SOKAT_Sober(String j) {
        System.out.println("I have"+" "+j);

    }
    public  String Print_variable(){
        return brand+" "+Gos+" "+Park+" "+breal;

    }
}
class car extends Vehicle {
    String color = "Black";
    String Engine_No = "55335466";
    public void Remove_Tiar(){
        System.out.println("I Can remove tiear");
    }

}
public class INH {
    public static void main(String[] args) {
        Vehicle V_N1 = new Vehicle();
        V_N1.SOKAT_Sober("DOMPE");

        V_N1.brand="Ford";
        V_N1.Gos = "ON Road";
        V_N1.Park = "Jemini";
//We canot access this : Becouse  -- private
        //V_N1.breal ="DOmi";
        System.out.println( V_N1.Print_variable());



        car C1 =new car();
        C1.brand = "SEL";
        C1.Gos  = "Yakkala";
        C1.Park = "kokoma";
        C1.color = "Jemini";
//We canot access this : Becouse  -- private
//      C1.breal ="DOmi";
        C1.Remove_Tiar();

    }
}
