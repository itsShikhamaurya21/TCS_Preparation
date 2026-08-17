import java.util.HashMap;
import java.util.Scanner;

public class RemoveFromUnsorted {
  public static void Remove(int arr[]) {

    // int k = 0;
    // for (int i = 0; i < arr.length; i++) {
    // boolean isduplicate = false;
    // for (int j = 0; j < i; j++) {
    // if (arr[i] == arr[j]) {
    // isduplicate = true;
    // break;
    // }
    // }
    // if (!isduplicate) {
    // arr[k] = arr[i];
    // k++;
    // }
    // }
    // for (int i = 0; i < k; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

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
      if (map.containsKey(arr[i])) {
        System.out.print(arr[i] + " ");
        map.remove(arr[i]);

      }
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Remove(arr);
  }
}
