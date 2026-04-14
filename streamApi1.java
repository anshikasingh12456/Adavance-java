import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class streamApi1 {
    public static void main(String[] args) {
        List <Integer> data=Arrays.asList(12,32,54,67,87);
        System.out.println(data);
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(23);
        list.add(43);
        list.addAll(List.of(23,34,56,67,89,90));
        list.addAll(data);
        System.out.println(list);
        list.stream().filter((n)->n>60).forEach((n)-> System.out.print(n+" "));;
        List <Integer> g60=list.stream().filter((n)->n>60).toList();
        System.out.println();
        System.out.println(g60);
    }
}
