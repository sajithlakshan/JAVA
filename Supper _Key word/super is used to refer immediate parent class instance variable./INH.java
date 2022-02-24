class Animal{
    String color="white";
}
class Dog extends Animal{
    String col="black";
    void printColor(){
        System.out.println(col);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }}
