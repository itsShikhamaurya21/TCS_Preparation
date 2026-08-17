import java.util.*;

public class Median {
  public static double median(int arr[]) {
    Arrays.sort(arr);
    int n = arr.length;
    if (arr.length % 2 == 0) {
      return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    } else {
      return arr[n / 2];
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements in an array ");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(median(arr));
    median(arr);
  }
}
