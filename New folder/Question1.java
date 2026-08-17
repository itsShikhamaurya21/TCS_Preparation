// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class Question1 {
  public static int SecondLargest(int arr[]) {
    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secmax = max;
        max = arr[i];
      } else if (arr[i] > secmax && arr[i] != max) {
        secmax = arr[i];
      }
    }
    return secmax;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(SecondLargest(arr));
  }
}