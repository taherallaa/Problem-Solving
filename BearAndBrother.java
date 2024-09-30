import java.util.Scanner;

/**
 * BearAndBrother
 */
public class BearAndBrother {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int limakWeight = scan.nextInt();
    int bobWeight = scan.nextInt();

    scan.close();

    int yearNeed = 0;

    while (true) {
      if (limakWeight == bobWeight) {
        yearNeed++;
        break;
      }
      if (limakWeight > bobWeight) {
        System.out.println(yearNeed);
        return;
      } else {
        yearNeed++;
        limakWeight *= 3;
        bobWeight *= 2;
      }
    }

    System.out.println(yearNeed);
  }
}
