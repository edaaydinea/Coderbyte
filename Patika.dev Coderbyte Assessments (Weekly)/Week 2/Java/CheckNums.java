import java.util.*;
import java.io.*;

class Main {

  public static String CheckNums(int num1, int num2) {
    // code goes here
    if (num1 < num2)
      return "true";
    else if (num1 > num2)
      return "false";
    else
      return "-1";
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(CheckNums(s.nextLine()));
  }

}