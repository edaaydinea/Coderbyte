import java.util.*;

class Main {

    public static boolean HappyNumbers(int num) {
        // code goes here
        if (num == 1 || num == 7)
            return true;
        int sum = num, x = num;

        while (sum > 9){
            sum = 0;

            while (x > 0)
            {
                int digit = x % 10;
                sum += digit * digit;
                x /= 10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }

        if (sum == 7)
            return true;
        return false;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(HappyNumbers(Integer.parseInt(s.nextLine())));
    }

}