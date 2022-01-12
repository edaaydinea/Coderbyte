import java.util.*;
import java.io.*;

class Main {

  public static int StepWalking(int num) {
    // code goes here
    if (num == 1) {
      return 1;
    }
    else if (num == 2) {
      return 2;
    }
    else {
      return (StepWalking(num - 1) + StepWalking(num - 2));
    }
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(StepWalking(s.nextLine()));
  }

}