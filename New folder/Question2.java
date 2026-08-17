
import java.util.*;

public class Question2 {
  public static void Palindrome(int n) {
    int rev = 0;
    int N = n;
    while (n > 0) {
      int ld = n % 10;
      rev = rev * 10 + ld;
      n = n / 10;
    }
    if (rev == N) {
      System.out.println("Number is palindrome");
    } else {
      System.out.println("Nnumber is not palindrome ");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();

    Palindrome(n);
  }

}
