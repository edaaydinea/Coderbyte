import java.util.*;

class KnightJumps {

    public static int knightJumps(String str) {
        // code goes here
        int x = Integer.parseInt(String.valueOf(str.charAt(1)));
        int y = Integer.parseInt(String.valueOf(str.charAt(3)));
        int[][] possible_moves = new int[][] {{-2,1},{-2, -1}, {2, -1}, {2, 1}, {-1, 2}, {-1, -2}, {1, 2}, {1, -2}};

        int count = 0;
        for (int[] possible_move : possible_moves) {
            int newX = x + possible_move[0];
            int newY = y + possible_move[1];

            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(knightJumps(s.nextLine()));
    }

}