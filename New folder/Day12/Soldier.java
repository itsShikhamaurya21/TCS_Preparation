import java.util.Scanner;

public class Soldier {
  static int answer = 0;

  // place the element at 'index', arr[index-1] already filled
  public static void solve(int index, int arr[], int val[], int end) {
    if (index == val.length - 1) {
      // last position must equal 'end'
      if (arr[index - 1] != end) {
        answer++;
      }
      return;
    }
    for (int i = 0; i < val.length; i++) {
      if (val[i] != arr[index - 1]) {
        arr[index] = val[i];
        solve(index + 1, arr, val, end);
      }
    }
  }

  public static int Soldier(int val[], int end) {
    int arr[] = new int[val.length];
    arr[0] = 1; // first position fixed to 1
    answer = 0;
    solve(1, arr, val, end);
    return answer;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int values[] = new int[x];
    for (int i = 0; i < x; i++) {
      values[i] = sc.nextInt();
    }
    int end = sc.nextInt();
    System.out.println(Soldier(values, end));
  }
}