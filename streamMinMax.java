import java.util.*;

// class streamMinMax{
//     public static void main(String[] args){
//         List<Integer> list=Arrays.asList(12,1,34,56,78,90,9,76,45,32,45,21,32);
        // List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
        // System.out.println(list);
        // System.out.println(sortedList);
//         Optional<Integer> result = list.stream().max((a,b)->a-b);
//         result.ifPresent(System.out::println);
//     }
// }


                                //!min
// class streamMinMax{
//     public static void main(String[] args){
//         List<Integer> list=Arrays.asList(12,1,34,56,78,90,9,76,45,32,45,21,32);
         // List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();
         // System.out.println(list);
         // System.out.println(sortedList);
//         Optional<Integer> result = list.stream().max((a,b)->b-a);
//         result.ifPresent(System.out::println);
//     }
//



                        // ? compare
// class streamMinMax {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "mango", "kiwi"));

//         String min = list.stream().min((a, b) -> b.compareTo(a)).get();

//         System.out.println(min);
//     }
// }




class streamMinMax {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "mango", "kiwi"));

        String min = list.stream().min((a, b) -> b.compareTo(a)).get();

        System.out.println(min);
    }
}