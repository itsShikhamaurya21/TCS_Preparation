import java.util.HashMap;
import java.util.*;

public class TwoSum {
  public static int[] twoSum(int nums[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int tar = target - nums[i];
      if (map.containsKey(tar)) {
        return new int[] { map.get(tar), i };
      }
      map.put(nums[i], i);

    }
    return new int[] { -1, -1 };
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int res[] = twoSum(arr, target);
    System.out.println(Arrays.toString(res));
  }
}
