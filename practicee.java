import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class practicee {
        int id;
        String name;
        double salary;
        int age;
        String department;

        public practicee(int id, String name, double salary, int age, String department) {
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
    
        @Override
    public String toString() {
        return "ID=" + id +
               ", Name=" + name +
               ", Salary=" + salary +
               ", Age=" + age +
               ", Dept=" + department;
    }
    public static void main(String[] args) {

        ArrayList<practicee> empList = new ArrayList<>(Arrays.asList(
                new practicee(101, "Amit", 50000, 25, "IT"),
                new practicee(102, "Neha", 60000, 28, "HR"),
                new practicee(103, "Ravi", 45000, 24, "IT"),
                new practicee(104, "Karan", 70000, 30, "Finance"),
                new practicee(105, "Pooja", 55000, 27, "HR"),
                new practicee(106, "Rohit", 80000, 32, "IT"),
                new practicee(107, "Simran", 65000, 29, "Finance"),
                new practicee(108, "Amit", 50000, 25, "IT")
        ));

        // Example: find minimum name (lexicographically)
        // String minName = empList.stream()
        //         .map(practicee::getName)
        //         .min(String::compareTo)
        //         .get();

        // System.out.println("Min Name: " + minName);


        // double secondMaxSalary = empList.stream()
        // .map(practicee::getSalary)
        // .distinct()                      // remove duplicates
        // .sorted((a, b) -> Double.compare(b, a)) // descending order
        // .skip(1)                         // skip max
        // .findFirst()
        // .orElseThrow(() -> new RuntimeException("No second max"));

        // System.out.println("Second Max Salary: " + secondMaxSalary);



        // double secondLowestSalary = empList.stream()
        // .map(practicee::getSalary)
        // .distinct() // important!
        // .sorted()   // ascending order
        // .skip(1)    // skip lowest
        // .findFirst()
        // .orElseThrow(() -> new RuntimeException("No second lowest"));

        // System.out.println("Second Lowest Salary: " + secondLowestSalary);



        // empList.stream()
        // .map(practicee::getSalary)
        // .distinct() // remove duplicates (important)
        // .sorted((a, b) -> Double.compare(b, a)) // descending
        // .limit(3) // top 3
        // .forEach(s -> System.out.println("Top Salary: " + s));



        // empList.stream()
        // .map(practicee::getSalary)
        // .distinct()              // remove duplicates
        // .sorted()                // ascending (lowest first)
        // .limit(3)                // first 3 = lowest 3
        // .forEach(s -> System.out.println("Low Salary: " + s));


        // empList.stream()
        // .collect(Collectors.toMap(
        //     practicee::getSalary,
        //     e -> e,
        //     (e1, e2) -> e1
        // ))
        // .values()
        // .forEach(System.out::println);


        // double minSalaryIT = empList.stream()
        // .filter(e -> e.getDepartment().equals("IT")) // filter IT
        // .map(practicee::getSalary)                  // get salaries
        // .min(Double::compare)                       // find min
        // .orElseThrow(() -> new RuntimeException("No IT employees"));

        // System.out.println("Min Salary in IT: " + minSalaryIT);



        // double maxSalaryHR = empList.stream()
        // .filter(e -> e.getDepartment().equals("HR")) // filter HR
        // .map(practicee::getSalary)                  // extract salary
        // .max(Double::compare)                       // max
        // .orElseThrow(() -> new RuntimeException("No HR employees"));

        // System.out.println("Max Salary in HR: " + maxSalaryHR);



        // practicee maxEmp = empList.stream()
        // .filter(e -> e.getDepartment().equals("HR"))
        // .max(Comparator.comparing(practicee::getSalary))
        // .orElseThrow(() -> new RuntimeException("No HR employees"));

        // System.out.println(maxEmp.getName() + " - " + maxEmp.getSalary());


        // practicee minEmp = empList.stream()
        // .filter(e -> e.getAge() < 25) // age < 25
        // .min(Comparator.comparing(practicee::getSalary)) // min salary
        // .orElseThrow(() -> new RuntimeException("No employee found"));

        // System.out.println(minEmp.getName() + " - " + minEmp.getSalary());


        //  empList.stream()
        // .limit(5) // take first 5
        // .forEach(System.out::println);



        empList.stream()
        .collect(java.util.stream.Collectors.toMap(
                practicee::getName,   // key = name
                e -> e,
                (e1, e2) -> e1        // keep first occurrence
        ))
        .values()
        .stream()
        .limit(5) // first 5 after removing duplicates
        .forEach(System.out::println);
    }
}
