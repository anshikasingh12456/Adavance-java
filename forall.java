import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class forall {
    
    public static void main(String[] args) {

      //  List<Integer> list = Arrays.asList(10, 50, 30, 20, 60, 40, 70);

        // int sum = list.stream()
        //         .sorted(Comparator.reverseOrder()) // descending
        //         .limit(3) // top 3
        //         .mapToInt(Integer::intValue)
        //         .sum();

        // System.out.println("Sum of top 3: " + sum);


        // int secondSmallest = list.stream()
        // .distinct()
        // .sorted()
        // .skip(1)
        // .findFirst()
        // .get(); // direct value
        //  System.out.println("Second Smallest: " + secondSmallest);


        // List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 6, 4);

        // list.stream()
        //     .map(x -> x * x)                
        //     .sorted(Comparator.reverseOrder()) 
        //     .limit(4)                       
        //     .forEach(System.out::println);


        // list.stream()
        //     .sorted((a, b) -> (b*b) - (a*a)) 
        //     .limit(4)
        //     .forEach(x -> System.out.println(x * x)); 



        // List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 6, 4);
            // int sum = list.stream()
            //           .sorted()
            //           .limit(4)
            //           .reduce(0, (a, b) -> a + b); // direct sum

            //  System.out.println(sum);



        // List<Integer> list = Arrays.asList(3, 5, 0, 23, 12, 67, 20);
        // Optional<Integer> result = list.stream()
        //                               .filter(x -> x > 20 && x % 2 != 0)
        //                               .min(Integer::compare);

        // result.ifPresent(System.out::println);


        // List<Integer> list = Arrays.asList( 5, 0, 23, 12, 12, 20);
        // int product = list.stream()
        //                   .filter(x -> x > 5)       // sirf >5
        //                   .reduce(1, (a, b) -> a * b); // product

        // System.out.println(product);


        // List<Integer> list = Arrays.asList( 5, 0, 23, 12, 12, 20);
        // int result = list.stream()
        //                  .filter(x -> x % 2 != 0) 
        //                  .max((a, b) -> (a*a) - (b*b)) 
        //                  .get();

        // System.out.println(result * result);



        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8, 6, 4);

        int sum = list.stream()
                      .filter(x -> x % 2 == 0)              // even numbers
                      .sorted(Comparator.reverseOrder())    // descending
                      .limit(3)                             // top 3
                      .reduce(0, (a, b) -> a + b);          // sum

        System.out.println(sum);
    }
}
