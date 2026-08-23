
import java.util.Scanner;

public class Gym {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int month = sc.nextInt();
    if (month % 12 == 0) {
      System.out.print(month / 12 * 15000);
    } else if (month % 9 == 0) {
      System.out.println(month / 9 * 12000);
    } else if (month % 6 == 0) {
      System.out.println(month / 6 * 7000);
    } else if (month % 3 == 0) {
      System.out.println(month / 3 * 3000);
    } else {
      System.out.println("Error");
    }
  }
}
