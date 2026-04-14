import java.util.ArrayList;
import java.util.Arrays;
// import java.util.function.Consumer; 
import java.util.List;

record student(int sid, String name, String course) {
};
public class MianRecord {
    public static void main(String[] args) {
        // student s=new student(1, "Avhi", "mca");
        // // System.out.println(s.sid());
        // // System.out.println(s.name());
        // // System.out.println(s.course());
        // System.out.println(s);
        // List<Integer> listdata= Arrays.asList(data);
        // System.out.println(listdata);
        Integer data[] = new Integer[] {12,32,34,65,76};
        
        List<Integer> listdata = Arrays.stream(data).toList();
        // System.out.println(listdata);

                                /*use for each methode referencing ke throgh bhi skr skte hai*/
        // listdata.forEach((value)->System.out.print(value+" "));;
        listdata.forEach(System.out::println);;
    }
}
