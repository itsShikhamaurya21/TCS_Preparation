
import java.util.*;

public class Medium {
  public static int energy(int arr[]) {
    int min = Integer.MAX_VALUE;
    int scmin = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        scmin = min;
        min = arr[i];
      } else if (arr[i] != min && arr[i] < scmin) {
        scmin = arr[i];
      }
    }
    return scmin + min;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(energy(arr));
  }
}
