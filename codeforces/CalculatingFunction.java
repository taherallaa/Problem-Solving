import java.util.Scanner;

/**
 * CalculatingFunction #486A
 */

public class CalculatingFunction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input number n
    long n = sc.nextLong();

    // Calculating the result based on whether n is even or odd
    long result;
    if (n % 2 == 0) {
      result = n / 2;
    } else {
      result = -(n / 2 + 1);
    }

    // Output the result
    System.out.println(result);

    sc.close();
  }
}
