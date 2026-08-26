import java.util.Scanner;

public class Chocolate {
  public static void chocolate(int arr[]) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] != 0) {
        arr[j] = arr[i];
        j++;
      }
    }
    while (j < arr.length) {
      arr[j] = 0;
      j++;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    chocolate(arr);
  }
}
