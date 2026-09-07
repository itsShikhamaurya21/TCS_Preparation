import java.util.Scanner;

public class CheckRotated {
  public static int min(int arr[]) {
    int min = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[min] > arr[i]) {
        min = i;
      }
    }
    return min;
  }

  public static void rotated(int arr[]) {
    int start = min(arr);
    rotate(start, arr.length - 1, arr);
    rotate(0, start - 1, arr);
    rotate(0, arr.length - 1, arr);
  }

  public static int rotate(int start, int end, int arr[]) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return -1;
  }

  public static boolean CheckRotated(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }

    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    rotated(arr);
    System.out.println(CheckRotated(arr));
  }
}
