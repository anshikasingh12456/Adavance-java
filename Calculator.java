class sum{
    int num1,num2;
    sum(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getsum(){
        int s=num1+num2;
        System.out.println(s);
    }
    class sub{
        void getsub(){
        int s=num1-num2;
        System.out.println(s);
    }
    }
}

class Calculator{
    public static void main(String[] args) {
        sum s1=new sum(23,45);
        s1.getsum();
    }
}