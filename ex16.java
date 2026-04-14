import java.util.*;

class Student {
    private int sid;
    private String name;
    private int marks;

    public Student(int sid, String name, int marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public int getSid() { return sid; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return sid + "\t" + name + "\t" + marks;
    }
}

public class ex16 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "avhi", 78));
        list.add(new Student(2, "anand", 88));
        list.add(new Student(3, "anshika", 68));
        list.add(new Student(4, "ram", 48));
        list.add(new Student(5, "xyz", 38));

        // Table Header
        System.out.println("SID\tNAME\tMARKS");
        System.out.println("-------------------------");

        // Filter + Table Output
        list.stream()
            .filter(s -> s.getMarks() > 60)
            .forEach(System.out::println);
    }
}