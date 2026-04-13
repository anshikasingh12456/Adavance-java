class Person {
    String name;
    int age;

    Person(String name, int age) {   // parameterized constructor
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class UserDefine {
    public static void main(String[] args) {
        Person p = new Person("Avhishek", 21);
        p.show();
    }
}
