import java.util.*;
import java.io.*;

class EvenPairs {

    public static String evenPairs(String str) {
        // code goes here
        String[] coll = SplitNumbers(str);
        for (String item: coll){
            if (item.length() > 1 && isEvenPair(Integer.parseInt(item))){
                return "true";
            }
        }
        return "false";
    }

    private static String[] SplitNumbers(String str){
        return str
                .toLowerCase()
                .replaceAll("([^0-9])"," ")
                .replaceAll(" +"," ")
                .trim().split(" ");
    }

    private static boolean isEvenPair(Integer num){
        int len = (int) (Math.log10(num) + 1);
        for (int i = len - 1; i > 0; i--){
            int num1 = num / addFollowingZeros(i);
            int num2 = num - num1;
            if (num1 % 2 == 0 && num2 % 2 == 0){
                return true;
            }
        }
        return false;
    }

    private static int addFollowingZeros(int digits){
        int result = 1;
        if (digits == 1){
            return result;
        }
        for (int i = 0; i < digits; i++){
            result *=10;
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(evenPairs(s.nextLine()));
    }

}
