import java.util.Scanner;

public class Expression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the three integers a, b, and c
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    // Calculate all possible results
    int result1 = a + b + c;
    int result2 = a * b * c;
    int result3 = (a + b) * c;
    int result4 = a * (b + c);
    int result5 = a + (b * c);
    int result6 = (a * b) + c;

    // Find the maximum of all results
    int maxResult = Math.max(result1, Math.max(result2, Math.max(result3,
        Math.max(result4, Math.max(result5, result6)))));

    // Output the maximum result
    System.out.println(maxResult);

    scanner.close();
  }
}
