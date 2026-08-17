
import java.util.*;

public class Question5 {
  public static void Anagram(String str1, String str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    if (str1.length() != str2.length()) {
      System.out.println("Not Anagrams");
    } else {
      char[] ch1 = str1.toCharArray();
      char[] ch2 = str2.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      if (Arrays.equals(ch1, ch2)) {
        System.out.println("Anagrams ");
      } else {
        System.out.println("Not Anagrams");
      }
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Str1 : ");
    String n1 = sc.nextLine();
    System.out.println("Enter the Str2 : ");
    String n2 = sc.nextLine();

    Anagram(n1, n2);
  }
}