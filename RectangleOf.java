//  class Rectangle {
//     int length, breadth;
//     Rectangle(int length, int breadth)
//     {
//         this.length=length;
//         this.breadth=breadth;
//     }
//     void area()
//     {
//         int s=length*breadth;
//         System.out.println(s);
//     }
    
//  }

// public class RectangleOf {
//     public static void main(String[] args) {
//         Rectangle p=new Rectangle(12, 12);
//         p.area();
//     }
// }




class Rectangle {
    int length, breadth;

    // default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println(length * breadth);
    }
}

public class RectangleOf {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();       // uses default
        Rectangle r2 = new Rectangle(12,12);  // uses parameterized

        r1.area();   // 1
        r2.area();   // 144
    }
}

