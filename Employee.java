import java.util.*;


public class Employee {
        int id;
        String name;
        double salary;
        int age;
        String department;

        public Employee(int id, String name, double salary, int age, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.department = department;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getSalary() { return salary; }
        public int getAge() { return age; }
        public String getDepartment() { return department; }
    

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

        // Example: find minimum name (lexicographically)
        String minName = empList.stream()
                .map(Employee::getName)
                .min(String::compareTo)
                .get();

        System.out.println("Min Name: " + minName);
    }
}
