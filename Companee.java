// class Employee{
//     int id,sallary;
//     Employee(int id, int sallary){
//         this.id=id;
//         this.sallary=sallary;
//     }
//     void display(){
//         if (sallary<10000) {
//             System.out.println("10000");
//         }
//         else{
//             System.out.println(sallary);
//         }
//     }
// }

// public class Companee {
//     public static void main(String[] args) {
//         Employee e=new Employee(101, 110000);
//         e.display();
//     }
// }




class Employee{
    int id, salary;

    Employee(int id, int salary){
        this.id = id;

        if(salary < 10000){
            this.salary = 10000;
        } else {
            this.salary = salary;
        }
    }

    void display(){
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Companee {
    public static void main(String[] args) {
        Employee e = new Employee(101, 2000);
        e.display();
    }
}
