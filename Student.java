class a{
    String name;
    int rollno;
    a(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void show(){
        System.out.println("name: " +name);
        System.out.println("rollno: " +rollno);
    }
}

public class Student {
    public static void main(String[] args) {
        a s=new a("avhi",8);
        s.show();
    }
}
