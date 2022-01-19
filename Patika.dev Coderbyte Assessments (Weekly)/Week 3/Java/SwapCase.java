import java.util.*;
import java.io.*;

class Main {

    public static String SwapCase(String str) {
        // code goes here
        String output = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isLowerCase(str.charAt(i))) {
                    output += Character.toUpperCase(str.charAt(i));
                }
                else if (Character.isUpperCase(str.charAt(i))) {
                    output += Character.toLowerCase(str.charAt(i));
                }
            }
            else {
                output += str.charAt(i);
            }
        }
        return output;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SwapCase(s.nextLine()));
    }

}