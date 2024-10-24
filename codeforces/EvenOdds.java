import java.util.Scanner;

/**
 * EvenOdds #318A
 */
public class EvenOdds {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long k = sc.nextLong();
    sc.close();

    long oddCount = (n + 1) / 2;

    if (k <= oddCount) {
      System.out.println(2 * k - 1);
    } else {
      System.out.println(2 * (k - oddCount));
    }
  }
}
