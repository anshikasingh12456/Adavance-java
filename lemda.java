// interface calc{
//     void calculate();
// }



// public class lemda{
//     public static void main(String[] args) {
//         calc a1=()-> 
//         {
//             int num1=10, num2=90;
//             System.out.println("sum : "+(num1+num2));
//         }; 
//         a1.calculate();
//     }
// }




// interface calc{
//     void calculate(int n1, int n2);
// }

// public class lemda{
//     public static void main(String[] args) {
//         calc a1=(int n1, int n2)-> System.out.println("sum : "+(n1+n2)); 
        
            
//         a1.calculate(10,34);
//     }
// }

// interface calc{
//     int square(int n1);
// }

// public class lemda{
//     public static void main(String[] args) {
//         calc a1=(int num)-> num * num;
        
//         int result=a1.square(10);
//         System.out.println("result : "+result);
//     }
// }

// interface calc{
//     String square(int n1);
// }

// public class lemda{
//     public static void main(String[] args) {
//         calc a1= num-> "square of number = "+(num*num);
        
//         String result=a1.square(20);
//         System.out.println(result);
//     }
// }



// @FunctionalInterface
// interface Voter {                 // Change 1: Class names should start with capital (not mandatory but standard)
//     void check(int age);          // Change 2: spelling "cheak" → "check"
// }

// public class lemda {             // Change 3: Class name capitalized (recommended)

//     public static void main(String[] args) {   // Change 4: main method syntax fixed

//         Voter v = age -> {        // Lambda expression
//             if (age >= 18) {      // Change 5: voting age should be >= 18
//                 System.out.println("You can vote..!!");
//             } else {
//                 System.out.println("You cannot vote...!!");
//             }
//         };

//         v.check(21);              // Change 6: method name corrected
//     }
// }


@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

class MathOperations {

    public static int add(int a, int b) {
        return a + b;
    }
}

public class lemda {

    public static void main(String[] args) {

        // Method Reference
        Calculator c = MathOperations::add;

        int result = c.operation(10, 20);

        System.out.println("Result = " + result);
    }
}
