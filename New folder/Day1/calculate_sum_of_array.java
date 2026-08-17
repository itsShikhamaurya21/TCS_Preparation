import java.util.*;

public class calculate_sum_of_array {
  public static void sum(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = arr[i] + sum;
    }
    System.out.print("Sum of arrya is " + sum);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sum(arr);
  }
}
