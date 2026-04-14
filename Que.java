class box{
    int size;
    box(){
        size=1;
    }

    box(int size){
        this.size=size;
    }
    void volume(){
        System.out.println(size*size*size);
    }

}

public class Que {
    public static void main(String[] args) {
        box s=new box();
        box p=new box(2);


        s.volume();
        p.volume();
    }
}