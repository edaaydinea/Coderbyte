import java.util.*;
import java.io.*;

class Main {

    public static int SwitchSort(int[] arr) {
        // code goes here
        int swap = 0;
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, Boolean.FALSE);

        for (int i = 0; i <arr.length; i++) {
            int j = i;
            int counter = 0;
            while (!(visited[j])) {
                visited[j] = true;
                j = arr[j] - 1;
                counter += 1;
            }
            if (counter != 0) {
                swap += (counter - 1);
            }
        }
        return swap;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SwitchSort(s.nextLine()));
    }

}