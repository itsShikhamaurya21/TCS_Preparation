import java.util.*;

public class ArrayCount {
  public static void Count(int arr1[], int arr2[]) {
    int count = 0;
    // int n = Math.min(arr1.length, arr2.length);
    // int j = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr1[i] == arr2[i]) {
    // count++;
    // j++;
    // }
    // }
    // int m = Math.max(arr1.length, arr2.length);
    // while (j < m) {
    // count++;
    // j++;
    // }

    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      if (!set.contains(arr1[i])) {
        set.add(arr1[i]);
        count++;
      }
    }
    for (int i = 0; i < arr2.length; i++) {
      if (!set.contains(arr2[i])) {
        set.add(arr1[i]);
        count++;
      }
    }

    System.out.println(count);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int arr1[] = new int[x];
    int arr2[] = new int[y];
    for (int i = 0; i < x; i++) {
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < y; i++) {
      arr2[i] = sc.nextInt();
    }
    Count(arr1, arr2);
  }
}
