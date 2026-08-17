import java.util.*;

public class Question10 {
  public static void reverse(String str) {
    String words[] = str.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      System.out.print(words[i]);
      if (i != 0) {
        System.out.print(" ");
      }
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String ");
    String str = sc.nextLine();
    reverse(str);
  }
}
