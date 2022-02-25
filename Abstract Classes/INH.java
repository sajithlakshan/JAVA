abstract  class Nimal {
    abstract void run();
    void eat(){
        System.out.println("Yoooooooo");
    }
}
class Kamal extends  Nimal{
    void run(){
        System.out.println("I neeed Go...");
    }
    void drink(){
        System.out.println("Drinking");
    }
}

public class INH{
    public static void main(String args[]){
        Kamal Obj = new Kamal();
        Obj.eat();
        Obj.drink();
        Obj.run();

        //Object Hadanna Be
 //       Nimal nim =new Nimal() {

 //       }

    }
}
