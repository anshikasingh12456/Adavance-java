 class person {
    String name;
    int age;
    person()        //  default  constructor
    {
        name="avhishek";
        age=21;
    }    
}

public class NameAndAge {
    public static void main(String[] args) {
        person s=new person();
        System.out.println("name is " +s.name);
        System.out.println("age is " +s.age);
    }
}
