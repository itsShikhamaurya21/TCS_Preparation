
import java.util.*;
import java.util.Scanner;

public class Repeating {
  public static void repeating(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int freq = map.get(arr[i]);
        map.put(arr[i], freq + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (map.get(arr[i]) > 1 && !set.contains(arr[i])) {
        list.add(arr[i]);
        set.add(arr[i]);

      }
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    repeating(arr);
  }
}
