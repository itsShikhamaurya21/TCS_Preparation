import java.util.Scanner;

public class RemoveDuplicatesSorted {
  public static void remove(int arr[]) {
    boolean isduplicate = false;
    int k = 1;
    arr[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[k] = arr[i];
        k++;
      }
    }
    for (int i = 0; i < k; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    remove(arr);
  }
}
