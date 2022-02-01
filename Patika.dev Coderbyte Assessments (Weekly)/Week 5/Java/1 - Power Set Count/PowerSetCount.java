import java.util.*;
import java.io.*;

class Main {

    public static int PowerSetCount(int[] arr) {
        // code goes here
        return (int) Math.pow(2, arr.length);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PowerSetCount(s.nextLine()));
    }

}