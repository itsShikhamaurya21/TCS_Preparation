import java.util.Scanner;

public class Question7 {
  public static void fibonacci(int n) {
    int a = 0;
    int b = 1;
    System.out.println("Fibonacci series is : ");
    for (int i = 0; i < n; i++) {
      System.out.print(a + " ");
      int c = a + b;
      a = b;
      b = c;
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    fibonacci(n);
  }
}
