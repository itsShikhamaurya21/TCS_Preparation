import java.util.*;

public class SingleNumber {
  public static int SingleNumber(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int freq = map.get(arr[i]);
        map.put(arr[i], freq + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    if (map.size() == 1) {
      return arr[0];
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (map.get(arr[i]) == 1) {
          return arr[i];
        }
      }
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
    int res = SingleNumber(arr);
    System.out.println(res);
  }
}
