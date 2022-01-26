import java.util.*;
import java.io.*;

class Main {

    public static String TwoSum(int[] arr) {
        // code goes here
        int target = arr[0];

        StringBuilder results = new StringBuilder();

        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == target) {
                        if (!(results.toString().contains(arr[j]+","+arr[i]))) {
                            results.append(arr[i] + "," + arr[j] + " ");
                        }
                    }
                }
            }
        }
        return (results.toString().length() > 0) ? results.toString() : "-1";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TwoSum(s.nextLine()));
    }

}