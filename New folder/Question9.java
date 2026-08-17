import java.util.*;

public class Question9 {
  public static void MaximumOccuringChar(String s) {
    int freq[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        freq[ch - 'a']++;
      }
    }
    int max = 0;
    char ans = ' ';
    for (int i = 0; i < 26; i++) {
      if (freq[i] > max) {
        max = freq[i];
        ans = (char) ('a' + i);
      }
    }
    System.out.print("Maximum occuring character is " + ans + "and maximum count is " + max);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    String s = sc.nextLine();
    MaximumOccuringChar(s);
  }
}
