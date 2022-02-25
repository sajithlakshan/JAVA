class Vehicle{

    void Park(){
        System.out.println("Not Meening");
    }
}
class Car extends Vehicle {
    void Park(){
        System.out.println("Park in CAR park");
    }
}

class Bus extends Vehicle {
    void Park(){
        System.out.println("Park in BUS park");
    }
}
class Van extends Vehicle {
    void Park(){
        System.out.println("Park in VAN park");
    }
}

class INH{
    public static void main(String args[]){
        Vehicle C = new Car();
        C.Park();


        Vehicle v = new Van();
        v.Park();

        Vehicle B = new Bus();
        B.Park();
    }
}
