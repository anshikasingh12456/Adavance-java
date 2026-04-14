import java.util.*;
import java.util.stream.IntStream;
// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78,98,90,65,46);
//         int sum=list.stream().reduce(0, (a,b)->a+b);
//         System.out.println("sum= "+sum);
//     }
// }




// class reduceEX{
    // public static void main(String[] args) {
    //     List<Integer> list=Arrays.asList(12,34,56,78,98,90,65,46);
    //     int sum=list.stream().reduce(0, (a,b)->a+b);
    //     System.out.println("sum= "+sum);
    //     double avg=sum/list.size();
    //     System.out.println("avg : "+avg);
    // }
// }



// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78);
//         int mul=list.stream().reduce(1, (a,b)->a*b);
//         System.out.println("mul = "+mul);
//     }
// }


// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78);
//         int max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
//         System.out.println("max = "+max);
//     }
// }


// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78,98,90,65,46);
        // int count=list.stream().reduce(0, (a,b)->a+1);
//         long count =list.stream().count();
//         System.out.println("count  = "+count);
//     }
// }




//  class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78,98,90,65,46);
//         int sum=list.stream().filter(n -> n % 2 == 0).reduce(0, (a,b)->a+b);
//         System.out.println("sum= "+sum);
//     }
// }



// class reduceEX{
//     public static void main(String[] args) {
//         List<String> list=Arrays.asList("java","stream");
//         String result = list.stream().reduce("", (a, b) -> a + " " + b).trim();
//         System.out.println(result);
//     }
// }



// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(12,34,56,78,45,76,98);
        // int max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> {
        //     if (a > b) {
        //         return a;
        //     } else {
        //         return b;
        //     }
           // });
//         int max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        //  System.out.println("max = "+max);
//          int SecondMax = list.stream().reduce(0, (a, b) -> a > b && a < max ? a : b);
//          System.out.println(SecondMax);
//     }
// }

//10
// class reduceEX{
//     public static void main(String[] args) {
//         List<String> str=Arrays.asList("java","c","python");
//         String longest = str.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
//         System.out.println(longest);
//     }
// }



// class reduceEX{
//     public static void main(String[] args) {
//         List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//         int sum=list.stream().reduce(0, (a,b)->a+(b%10)+(b%10)/10);
//         System.out.println("sum= "+sum);
//     }
// }



// class reduceEX{
//     public static void main(String[] args) {
//         int val=123456;
//         int rel=String.valueOf(val).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
//         System.out.println(rel);
//     }
// }




//aayega  
class  reduceEX{
    public static void main(String[] args) {
        int n = 5;

        int fact = IntStream.rangeClosed(1, n)
                            .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial = " + fact);
    }
}