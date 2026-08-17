import java.util.Scanner;

public class add {
  public static void add(int arr[], int size, int ind, int el) {

    for (int i = size; i > ind; i--) {
      arr[i] = arr[i - 1];
    }
    arr[ind] = el;
    for (int i = 0; i <= size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x + 1];

    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    int idx = sc.nextInt();
    int el = sc.nextInt();
    add(arr, x, idx, el);
  }
}
