// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class Question6 {
  public static void RemoveDuplicate(int arr[]) {
    int k = 1;
    boolean isDuplicate = false;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        isDuplicate = true;
        arr[k++] = arr[i];
      }
    }
    for (int i = 0; i < k; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    RemoveDuplicate(arr);
  }
}