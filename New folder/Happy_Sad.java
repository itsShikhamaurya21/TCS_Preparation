import java.util.Scanner;

public class Happy_Sad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double happy = N, newHappy = 0;
    double sad = 0, newSad = 0;
    for (int i = 0; i <= 10; i++) {
      newSad = 0.5 * sad + 0.7 * happy;
      newHappy = 0.5 * sad + 0.3 * happy;
      sad = newSad;
      happy = newHappy;
    }
    System.out.printf("%.4f %.4f", newHappy, newSad);
  }
}
