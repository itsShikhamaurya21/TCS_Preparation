import java.util.*;

public class MaximumProductSubarray {
  public static void maximumProduct(int arr[]) {
    // int prod = 1;
    // int j = 0;
    // for (int i = 0; i < k; i++) {
    // prod = prod * arr[i];
    // }
    // int max = prod;
    // for (int i = k; i < arr.length; i++) {
    // prod = prod / arr[i - k];
    // prod = prod * arr[i];
    // }
    // max = Math.max(max, prod);

    int max = Integer.MIN_VALUE;
    int leftprod = 1;
    int rightprod = 1;
    for (int i = 0; i < arr.length; i++) {
      leftprod = leftprod * arr[i];
      rightprod = rightprod * arr[arr.length - 1 - i];
      if (leftprod > max)
        max = leftprod;
      if (rightprod > max)
        max = rightprod;
      if (leftprod == 0)
        leftprod = 1;
      if (rightprod == 0)
        rightprod = 1;
    }
    System.out.println(max);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    // int k = sc.nextInt();
    maximumProduct(arr);
  }
}
