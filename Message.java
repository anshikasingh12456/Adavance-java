class DisplayMassege{
    void displayInfo(){
        System.out.println("welcom to java");
    }
}
class Message{
    public static void main(String[] args){
        DisplayMassege dm=new DisplayMassege();
        dm.displayInfo();
    }
}