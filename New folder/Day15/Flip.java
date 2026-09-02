import java.util.Scanner;

public class Flip {
  public static int flip(String s, int k) {
    char ch[] = s.toCharArray();
    int flip = 0;
    int n = ch.length - k;
    int i = 0;
    for (; i < n; i++) {
      if (ch[i] == '0') {
        for (int j = i; j < k; j++) {
          ch[j + i] = (ch[j + i] == '0') ? '1' : '0';
          flip++;
        }
      }
      while (ch[++n] != ch.length) {
        if (ch[i] == '0')
          return -1;
      }

    }
    return flip;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    flip(s, k);
  }
}
