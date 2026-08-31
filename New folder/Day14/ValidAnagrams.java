import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagrams {
  public static boolean valid(String str1, String str2) {
    HashMap<Character, Integer> map = new HashMap<>();
    if (str1.length() != str2.length())
      return false;
    for (int i = 0; i < str1.length(); i++) {
      char ch = str1.charAt(i);
      if (map.containsKey(ch)) {
        int freq = map.get(ch);
        map.put(ch, freq + 1);
      } else {
        map.put(ch, 1);
      }
    }
    for (int i = 0; i < str2.length(); i++) {
      char ch = str2.charAt(i);
      if (!map.containsKey(ch)) {
        return false;
      }
      map.put(ch, map.get(ch) - 1);
      if (map.get(ch) == 0)
        map.remove(ch);
    }
    return map.isEmpty();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // int x=sc.nextInt();
    // String str[]=new String[x];
    // for(int i=0;i<x;i++){
    // str[i]=sc.next();
    // }
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    boolean res = valid(s1, s2);
    System.out.println(res);

  }
}
