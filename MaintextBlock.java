public class MaintextBlock {
    public static void main(String[] args) {
        String data="""
                public class MinVar {
    public static void main(String[] args) {
        int a=10;
        var b=20;
        //var name="kiet MCA";
        var value=10.34;

        // // npt posible in lower
        // var c;
        // c=768;

        // var se instance variable nhi bana skte hai 

        // lekin aise kar skte hai
        var c=0.00;
        c=232.32;
        String name=new String("this is String..!!");
        var name1=new String("this is String with var..!!");// String ke jagah par var bhi likh skte hai jaise likha gaya hai
        int val[] = new int[] {10,23,45,67};
        for(var v:val){
            System.out.println(v);
        }
    }
}
                """;
        System.out.println(data);
    }
}
