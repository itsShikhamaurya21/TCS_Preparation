import java.util.*;

public class Average {
  public static int average(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum / arr.length;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Average of array is " + average(arr));
  }
}
