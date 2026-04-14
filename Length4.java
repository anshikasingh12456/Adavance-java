import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Length4{
    public static void main(String[] args){
        List<String> data=Array.asList("java","python","data","ghop","ghap","ram","trt");
        ArraysList<String> list=new ArrayList<>();
        list.addAll(List.of("java","python","data","ghop","ghap","ram","trt"));

        list.Stream().filter(s->s.length() > 4).forEach(s->System.out.print(s+" "));
    }
}