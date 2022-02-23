import java.io.*;
import java.util.*;

class Main {

    public static String NumberReverse(String str) {
        // code goes here
        String[] arrOfStr = str.split(" ");
        String arr2 = "";
        for (int i = arrOfStr.length - 1; i >= 0; i--)
            arr2 += arrOfStr[i] + " ";
        return arr2;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NumberReverse(s.nextLine()));
    }

}