class  Parent{
    void SOMIN() {
        System.out.println("method of parent class");
    }
}

class Child extends Parent {
    void PrintData() {
        System.out.println("method of child class");
    }
}
class INH{
    public static void main(String args[]) {
//Upcasting
        Parent obj1 = (Parent) new Child();
        obj1.SOMIN();
 //Thhis is not work
//        obj1.PrintData();




// Downcasting
        Child c = (Child) obj1;
        c.PrintData();
    }
}
