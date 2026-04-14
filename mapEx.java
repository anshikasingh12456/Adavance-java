// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;

// class mapEx{
//     public static void main(String[] args) {
//         List<Integer>numbers=Arrays.asList(21,32,45,67,89,90);
//         System.out.println(numbers);
//         List<Integer> result=numbers.stream().filter(n->n<40).map(n->n+20).toList();
//         System.out.println(result);
//     }
// }




//!CLASS WORK

                                    //1
// import java.util.*;
// import java.util.stream.*;

// class mapEx {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("java", "python", "c++");

//         List<String> result = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

//         System.out.println(result);
//     }
// }

                                    // 2 //

// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;

// class mapEx{
//     public static void main(String[] args) {
//         List<Integer>numbers=Arrays.asList(1,2,4,6,8);
//         System.out.println(numbers);
//         List<Integer> result=numbers.stream().map(n->n*n).toList();
//         System.out.println(result);
//     }
// }                   


                            // 3 //

// import java.util.*;

// public class mapEx {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("java", "spring", "boot");

//         list.stream().map(s -> s.charAt(0)).forEach(System.out::println);
//     }
// }


                        //7//

import java.util.ArrayList;
import java.util.List;

class Emplo {
    int eid;
    String name;
    String course;

    public Emplo(int eid, String name, String course) {
        this.eid = eid;
        this.name = name;
        this.course = course;
    }
}

public class mapEx {
    public static void main(String[] args) {

        List<Emplo> list = new ArrayList<>();

        list.add(new Emplo(1, "avhi", "mca"));
        list.add(new Emplo(2, "rahul", "bca"));

        // 🔥 Stream + Print (combined clean logic)
        // list.stream()
        //     .forEach(e -> System.out.println(
        //         e.eid + " " + e.name.toUpperCase() + " " + e.course.toUpperCase()
        //     ));

            list.stream()
            .map(e -> e.name)
            .forEach(System.out::println);
    }
}