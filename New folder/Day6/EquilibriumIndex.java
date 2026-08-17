import java.util.*;

public class EquilibriumIndex {
  public static int equilibriumIndex(int arr[]) {
    // equilibrium index - refers to the leftsum is eual to the rightsum of the
    // array
    // for example= arr[]={1 7 3 6 5 6 }, here 3 index is the equibrium index
    // because leftsum= 1+7+3=11 and rightsum=5+6=11
    int totalsum = 0;
    int leftsum = 0;
    int rightsum = 0;
    for (int i = 0; i < arr.length; i++) {
      totalsum += arr[i];
    }
    for (int i = 0; i < arr.length; i++) {

      rightsum = totalsum - arr[i] - leftsum;
      if (rightsum == leftsum)
        return i;
      leftsum = leftsum + arr[i];
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print(equilibriumIndex(arr));
  }
}