// import java.util.Comparator;

// public class Convert {
//     public static void main(String[] args) {

//         // Comparator<Integer> comp = (Integer a, Integer b) -> a - b;

//         // int result = comp.compare(10, 5);
//         // System.out.println(result);

        
//     }
// }


// @FunctionalInterface
// interface Square {
//     int calculate(int x);
// }

// public class Convert {
//     public static void main(String[] args) {

//         Square s = (int x) -> x * x;

//         int result = s.calculate(5);
//         System.out.println("Square = " + result);
//     }
// }

@FunctionalInterface
interface cheakpalindrom {
    boolean cheakpalin(String info);
}

class Convert{
    public static void main(String[] args) {
        cheakpalindrom cp=(String info)->new StringBuilder(info).reverse().toString().equals(info);
            // String inforev=new StringBuilder(info).reverse().toString();
            //return true;
    }
}

