import java.util.Scanner;

/**
 * DivisibilityProblem #1328A
 */
public class DivisibilityProblem {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testNumber = scan.nextInt();

    for (int i = 0; i < testNumber; i++) {
      int first = scan.nextInt();
      int second = scan.nextInt();

      if (first % second == 0) {
        System.out.println(0);
      } else if (first < second) {
        System.out.println(second - first);
      } else {
        int remainder = first % second;
        System.out.println(second - remainder);
      }
    }
    scan.close();
  }
}
