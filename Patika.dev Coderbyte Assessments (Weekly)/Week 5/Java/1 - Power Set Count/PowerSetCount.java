import java.util.*;
import java.io.*;

class PowerSetCount {

    public static int powerSetCount(int[] arr) {
        // code goes here
        return (int) Math.pow(2, arr.length);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(powerSetCount(s.nextLine()));
    }

}
