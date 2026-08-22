import java.util.Scanner;

public class MissingValue {
  public static int missing(int arr[]) {
    int n = arr.length;
    int sum = 0;
    int sumwhole = n * (n + 1) / 2;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sumwhole - sum;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    // missing(arr);
    System.out.println(missing(arr));
  
}