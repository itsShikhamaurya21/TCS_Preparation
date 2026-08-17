import java.util.Scanner;

public class Question8 {
  public static void Prime(int n) {
    boolean isPrime = true;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        isPrime = false;
        System.out.println("Nuber is not prime ");
        break;
      }
    }
    if (isPrime)
      System.out.println("Number is prime");

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    Prime(n);
  }
}
