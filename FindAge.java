class Age{
    int age;
    Age(int age){
        if(age<18){
            this.age=18;
        }
        else{
            this.age=age;
        }
    }
    void showAge(){
        System.out.println("age: " +age);
    }
}

public class FindAge {
    public static void main(String[] args) {
        Age a=new Age(10);
        a.showAge();
    }
}
