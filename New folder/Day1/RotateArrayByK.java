import java.util.*;

public class RotateArrayByK {
  public static void leftrotate(int arr[], int k) {
    // left rotate
    k = k % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, k + 1, arr.length - 1);
    reverse(arr, 0, k);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void rightRotate(int arr[], int k) {
    k = k % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static int reverse(int arr[], int left, int right) {
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;

    }
    return 0;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of array size");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the k value ");
    int k = sc.nextInt();
    // leftrotate(arr, k);
    rightRotate(arr, k);
  }
}
