class sum {
    int a,b;
    sum(int a, int b){
        this.a=a;
        this.b=b;
    }
    void sum(){
        int s=a+b;
        System.out.println(s);
    }
    
}

public class Add {
    public static void main(String[] args) {
        sum p=new sum(12, 13);
        p.sum();
    }
}
