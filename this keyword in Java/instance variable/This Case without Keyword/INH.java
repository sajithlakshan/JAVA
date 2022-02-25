class Student{
    int ro;
    String na;
    float fe;
    Student(int rollno,String name,float fee){
        ro=rollno;
        na=name;
        fe=fee;
    }
    void display(){
        System.out.println(ro+" "+na+" "+fe);
    }
}

class INH{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
