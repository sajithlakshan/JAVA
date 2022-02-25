class A{

    void m(){
        System.out.println("hello m");
        this.op();

    }
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
    void  op(){
        System.out.println("hello op");
    }
}
class INH{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }}
