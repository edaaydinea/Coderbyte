import java.util.*;
import java.io.*;

class Main {

  public static String PalindromeTwo(String str) {
    // code goes here

    str = str.replaceAll("[^a-zA-Z]", "");
    str = str.toLowerCase();

    String reverse = new StringBuilder(str).reverse().toString();
      if (reverse.equals(str)) {
        return "true";
      } else {
        return "false";
      }
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(PalindromeTwo(s.nextLine()));
  }

}