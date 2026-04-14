// interface printer{
//     default void print(String msg){
//         System.out.println("default:");
//         show(msg);
//     }
//     private void show(String msg){
//         System.out.println(msg.toUpperCase());
//     }
// }

// public class hom implements printer{
//     public static void main(String[] args) {
//         printer p=new hom();
//         p.print("java");

//         printer p2=new hom()::custom;
//         p2.print("lambda");
//     }
//     void custom(String amg){
//         System.out.println("custom: "+msg);
//     }
//}

public class hom {
    public static void main(String[] args) {
        var x=20;
        Readable r = () -> {
            System.out.println(x);
        }
        r.run();
    }
}
