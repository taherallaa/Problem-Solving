import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.floor;

/**
 * Elephant #617A
 */
public class Elephant {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int location = scan.nextInt();

    scan.close();

    Set<Integer> oneStepMove = new TreeSet<>(Comparator.reverseOrder());

    oneStepMove.add(1);
    oneStepMove.add(2);
    oneStepMove.add(3);
    oneStepMove.add(4);
    oneStepMove.add(5);

    int stepCount = 0;
    int reminder = 0;

    for (int i = 5; i > 1; i--) {

      if (oneStepMove.contains(location)) {
        stepCount += 1;
        System.out.println(stepCount);
        break;
      }

      reminder = location % i;

      if (reminder == 0) {
        stepCount += location / i;
        System.out.println(stepCount);
        break;
      }
      stepCount += floor(location / i);
      location -= i * floor(location / i);
    }

  }
}
