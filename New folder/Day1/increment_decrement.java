import java.util.*;

public class increment_decrement {
  public static void increment_decrement(int arr[]) {
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length - 1;
    int mid = (left + (right - left) / 2) + 1;
    while (mid <= right) {
      int temp = arr[mid];
      arr[mid] = arr[right];
      arr[right] = temp;
      mid++;
      right--;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    increment_decrement(arr);
  }
}
