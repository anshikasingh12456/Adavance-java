public class mainYield {
    public static void main(String[] args) {
        // SWITCH EXPRESSION
        int day=4;
        String result=switch(day){
            case 1,3,4 -> {// multiple case ye jo case hai String bhi ho skti hai number bhi ho skti hai
                System.out.println("this is day 1,3 and 4");
               yield "monday";
            }
            case 2 -> "teusday";
            case 5 -> "wednesday";
            default -> "no-day";
        };
        System.out.println(result);
    }
}
