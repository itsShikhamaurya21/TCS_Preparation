
import java.util.*;

public class Question3 {
  public static void CountConsoVowel(String n) {
    int countvowel = 0;
    int countconso = 0;
    n = n.toLowerCase();
    for (int i = 0; i < n.length(); i++) {
      char ch = n.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        countvowel++;
      } else {
        countconso++;
      }
    }
    System.out.println("Vowels count is " + countvowel);
    System.out.println("Conso count is " + countconso);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    String n = sc.nextLine();

    CountConsoVowel(n);
  }
}
