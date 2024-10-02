import java.util.Scanner;

/**
 * WrongSubtraction #977A
 */
public class WrongSubtraction {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();

    int result = n;

    for (int i = k; i > 0; i--) {
      if (result % 10 == 0) {
        result /= 10;
      } else {
        result -= 1;
      }
    }
    System.out.println(result);
  }
}
