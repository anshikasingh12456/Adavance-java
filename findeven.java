import java.util.Arrays;
import java.util.List;
import java.util.*;

class findeven{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(24,56,23,45);
        ArrayList<Integer> data=new ArrayList<Integer>();
        list.Stream().filter((n)->n%2==0).forEach((n))-> System.out.println(n+" ");
    }
}