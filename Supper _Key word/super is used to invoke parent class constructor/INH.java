class Animal{
    Animal(String k){
        System.out.println("animal is created"+" " +k);
    }
}
class Dog extends Animal{
    Dog(String j){
        super(j);
        System.out.println("dog is created");
    }
}
class INH{
    public static void main(String args[]){
        Dog d=new Dog("Pomaneriyan");
    }}
