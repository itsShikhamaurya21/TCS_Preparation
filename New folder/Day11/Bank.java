import java.util.*;

public class Bank {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] sender = new String[n];
    String[] receiver = new String[n];
    Double[] amount = new Double[n];
    Double[] timestamp = new Double[n];

    for (int i = 0; i < n; i++) {
      sender[i] = sc.next();
      receiver[i] = sc.next();
      amount[i] = sc.nextDouble();
      timestamp[i] = sc.nextDouble();
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (sender[i].equals(sender[j]) && receiver[i].equals(receiver[j]) && amount[i].equals(amount[j])
            && (timestamp[i] - timestamp[j]) <= 60) {
          System.out.print(sender[i] + " ");
          System.out.print(receiver[i] + " ");
          System.out.print(amount[i] + " ");
          System.out.print(timestamp[i] + " ");
          System.out.println();
          System.out.print(sender[j] + " ");
          System.out.print(receiver[j] + " ");
          System.out.print(amount[j] + " ");
          System.out.print(timestamp[j] + " ");
        }
      }
    }
  }
}
