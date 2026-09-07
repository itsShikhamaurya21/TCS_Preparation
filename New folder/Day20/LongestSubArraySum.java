import java.util.*;

public class LongestSubArraySum {
  public static int Longest(int arr[], int k) {
    int sum = 0;
    int max = 0;
    int left = 0;
    for (int right = 0; right < arr.length; right++) {
      sum = sum + arr[right];
      while (sum > k && left <= right) {
        sum = sum - arr[left];
        left++;
      }
      max = Math.max(max, right - left + 1);
    }
    return max;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(Longest(arr, k));

  }
}
