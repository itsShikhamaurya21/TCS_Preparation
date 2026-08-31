import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
  public static List<List<String>> valid(String str1[]) {
    HashMap<String, List<String>> map = new HashMap<>();
    List<List<String>> arr = new ArrayList<>();
    for (int i = 0; i < str1.length; i++) {
      char ch[] = str1[i].toCharArray();
      Arrays.sort(ch);
      String str = new String(ch);
      if (!map.containsKey(str)) {
        map.put(str, new ArrayList<>());
      }
      map.get(str).add(str1[i]);
    }
    arr.addAll(map.values());
    return arr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String str[] = new String[x];
    for (int i = 0; i < x; i++) {
      str[i] = sc.next();
    }
    List<List<String>> res = valid(str);
    for (List<String> s : res) {
      System.out.println(s);
    }

  }
}
