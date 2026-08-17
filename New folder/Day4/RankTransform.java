
import java.util.*;

public class RankTransform {
  public static void ranktransform(int arr[]) {
    int nums[] = arr.clone();
    Arrays.sort(nums);
    HashMap<Integer, Integer> map = new HashMap<>();
    int rank = 1;
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], rank);
        rank++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = map.get(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();

    }
    ranktransform(arr);
  }
}
