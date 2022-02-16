import java.util.*;
import java.io.*;

class Main {

    public static String FibonacciChecker(int num) {
        // code goes here
        int fn = 0, fn_1 = 0;
        int fn_2 = 1;

        while (fn <= num){
            if (fn == num)
                return "yes";
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return "no";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FibonacciChecker(s.nextLine()));
    }

}