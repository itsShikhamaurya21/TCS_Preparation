import java.util.*;

public class SortByFrequency {
  public static void SortByFreqency(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        int freq = map.get(arr[i]);
        map.put(arr[i], freq + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
    }
    Collections.sort(list, (a, b) -> {
      int freqA = map.get(a);
      int freqB = map.get(b);
      if (freqA == freqB) {
        return a - b;
      } else {
        return freqB - freqA;
      }
    });
    // for (int i = 0; i < list.size(); i++) {
    // int freq = map.get(list.get(i));
    // System.out.print(list.get(i) + " " + freq+" ");
    // for()
    // }
    // for (int j = 0; j < freq; j++) {
    // System.out.print(list.get(i) + " ");
    // }
    // }
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    SortByFreqency(arr);
  }

}
