// class Animal{
//     String name;
//     String sound;
//     Animal(){
//         this("cat1","");
//     }


//     Animal(String name, String sound){
//         this.name=name;
//         this.sound=sound;
//     }


//     void getInfo(){
//         System.out.println("cat name= " +name);
//         System.out.println("cat sound= " +sound);
//     }


//     void getInfo(String name, String sound,int legs){//overloding yaha se check hogi
//         System.out.println("name= " +name);
//         System.out.println("sound= " +sound);
//         System.out.println("on of legs= " +legs);
//     }
// }

// class cat extends Animal{
//     cat(String name,String sounnd){
//         super(name,sound);
//     }
// }

// public class polyMay {
//     public static void main(String[] args) {
//         // Animal an1=new Animal("horse","hingg");
//         // an1.getInfo();
//         // an1.getInfo("cat","meow",4);

//         cat c1=new cat();
//         c1.getInfo();
//     }
// }






class Animal {
    static String name;
    static String sound;

    Animal() {
        this("cat1", "");
    }

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    static void getInfo() {
        System.out.println("cat name = " + name);
        System.out.println("cat sound = " + sound);
    }

   static void getInfo(String name, String sound, int legs) {
        System.out.println("name = " + name);
        System.out.println("sound = " + sound);
        System.out.println("no of legs = " + legs);
    }
}

class Cat extends Animal {
    Cat(String name, String sound) {
        super(name, sound);
    }
    static void getInfo(){
        System.out.println("cat name: "+name);
        System.out.println("cat sound: "+sound);
    }
}

public class polyMay {
    public static void main(String[] args) {
        Cat c1 = new Cat("cat2", "meow");
        c1.getInfo();

        Animal c2 = new Cat("cat2", "meow");
        c2.getInfo();
    }
}
