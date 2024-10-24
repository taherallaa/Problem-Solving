import java.util.Scanner;

/**
 * KefaFirstSteps #580A
 */
public class KefaFirstSteps {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int days = scan.nextInt();

    int counter = 1;
    int maxSegmant = 1;

    int prevDay = scan.nextInt();

    for (int i = 1; i < days; i++) {
      int curDay = scan.nextInt();

      if (curDay >= prevDay) {
        counter++;
        maxSegmant = Math.max(maxSegmant, counter);
      } else {
        counter = 1;
      }

      prevDay = curDay;
    }

    System.out.println(maxSegmant);

    scan.close();
  }
}
