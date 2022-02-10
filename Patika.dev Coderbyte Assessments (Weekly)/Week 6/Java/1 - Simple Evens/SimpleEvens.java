import java.util.*;

class SimpleEvens {

    public static String simpleEvens(long number) {
        // code goes here
        String num = String.valueof(number);
        String[] digits = num.split("");

        for (String digit: digits){
            if (Long.parseLong(digit) % 2 != 0){
                return "false";
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(simpleEvens(s.nextLine()L));
    }

}
