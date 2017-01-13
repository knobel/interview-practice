package hackerrank.Arrays_LeftRotation;

import java.util.Scanner;

/**
 * Created by Michal Knobel on 13.01.2017.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    for(int a_i=0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }
    for (int i = 0; i < k; i++) {
      a = rotateLeft(a);
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static int[] rotateLeft(int[] a) {
    if (a == null)
      return null;

    int temp = a[0];
    for (int i = 0; i < a.length-1; i++) {
      a[i] = a[i+1];
    }
    a[a.length-1] = temp;

    return a;
  }
}
