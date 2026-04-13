import java.util.ArrayList;

class Student {
    int studentId;
    String studentName;
    String course;

    Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
}

public class sttuudent {
    public static void main(String[] args) {

        // "Table" using ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Rows (records)
        students.add(new Student(8, "AVHI", "MCA"));
        students.add(new Student(251, "ANAND", "MCA"));
        students.add(new Student(103, "KUCH", "MCA"));

        // Display table
        System.out.println("ID\tName\tCourse");
        for (Student s : students) {  //for each loop
            System.out.println(
                s.studentId + "\t" +
                s.studentName + "\t" +
                s.course
            );
        }
    }
}
