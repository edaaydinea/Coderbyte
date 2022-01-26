import java.util.*;
import java.io.*;

class Main {

  public static String ParallelSums(int[] arr) {
    // code goes here
    int[] firstSet = new int[arr.length / 2];
    int[] secondSet = new int[arr.length / 2];

    Arrays.sort(arr);

    int indexofSet1 = 0;
    int indexofSet2 = 0;
    int sumofSet1 = 0;
    int sumofSet2 = 0;
    int lastIndefofArr = arr.length - 1;

    while(indexofSet1 < firstSet.length && indexofSet2 < firstSet.length) {
      if (sumofSet1 < sumofSet2) {
        firstSet[indexofSet1] = arr[lastIndefofArr];
        indexofSet1++;
        sumofSet1 += arr[lastIndefofArr];
      }
      else {
        secondSet[indexofSet2] = arr[lastIndefofArr];
        indexofSet2++;
        sumofSet2 += arr[lastIndefofArr];
      }
      lastIndefofArr --;
    }

    while(lastIndefofArr >=0){
      if (indexofSet1 < firstSet.length) {
        firstSet[indexofSet1++] = arr[lastIndefofArr];
        sumofSet1 += arr[lastIndefofArr];
      }
      else {
        secondSet[indexofSet2++] = arr[lastIndefofArr];
        sumofSet2 += arr[lastIndefofArr];
      }
      lastIndefofArr --;
    }

    if (sumofSet1 != sumofSet2) {
      return String.valueOf(-1);
    }

    Arrays.sort(firstSet);
    Arrays.sort(secondSet);

    StringBuilder stringBuilder = new StringBuilder();
    if (firstSet[0] < secondSet[0]) {
      for (int intSet1 : firstSet) {
        stringBuilder.append(intSet1).append(",");
      }
      for (int intSet2 : secondSet) {
        stringBuilder.append(intSet2).append(",");
      }
    }
    else {
      for (int intSet2 : secondSet) {
        stringBuilder.append(intSet2).append(",");
      }
      for (int intSet1 : firstSet) {
        stringBuilder.append(intSet1).append(",");
      }
    }
    stringBuilder.setLength(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(ParallelSums(s.nextLine()));
  }

}