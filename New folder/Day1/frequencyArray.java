import java.util.Scanner;
import java.util.HashMap;

public class frequencyArray {
  public static void frequency(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int freq = map.get(arr[i]);
        map.put(arr[i], freq + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    System.out.println(map);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    frequency(arr);
  }
}
