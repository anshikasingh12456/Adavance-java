import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
//import java.util.function.padigate;
class StreamApi{
    public static void main(String[] args) {
        List <Integer> data=Arrays.asList(12,32,54,67,87);
        System.out.println(data);
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(23);
        list.add(43);
        list.addAll(List.of(23,34,56,67,89,90));
        list.addAll(data);
        System.out.println(list);
        //Stream listStream=list.stream();
        // list.stream().filter(n->n>60).forEach((element)-> System.out.print(element+" "));
        // //list.stream().forEach(System.out::println);
        // System.out.println();
        // System.out.println("count : "+list.stream().filter((item)->item>60).count());
    }
}


                            //*CLASS WORK

// class StreamApi{
//     public static void main(String[] args) {
//         ArrayList<String> list=new ArrayList<>();
//         list.add("avhi");
//         list.add("anand");
//         list.addAll(List.of("Anashika, xyz"));
//         System.out.println(list);
//         Stream liStream=list.stream();
//         list.stream().forEach(System.out::println);
//     }
// }