import java.util.*;

public class MinFirstSec {
  public static ArrayList<Integer> MinFirstSec(int arr[]) {
    ArrayList<Integer> ans = new ArrayList<>();
    int Firstmin = Integer.MAX_VALUE;
    int secmin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (Firstmin > arr[i]) {
        secmin = Firstmin;
        Firstmin = arr[i];
      } else if (secmin > arr[i] && Firstmin < arr[i]) {
        secmin = arr[i];
      }
    }
    ans.add(Firstmin);
    ans.add(secmin);
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(MinFirstSec(arr));
  }
}