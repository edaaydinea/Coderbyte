import java.util.*;

class Main {

    public static String SimpleEvens(String num) {
        // code goes here
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
        System.out.println(SimpleEvens(s.nextLine()));
    }

}