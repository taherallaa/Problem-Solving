import java.util.Scanner;

/**
 * StonesTable #266A
 */

public class StonesTable {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int stoneNumber = scan.nextInt();
    String stoneColor = scan.next();

    int removedStone = 0;
    char currentColor = stoneColor.charAt(0);

    for (int i = 1; i < stoneNumber; i++) {
      if (stoneColor.charAt(i) == currentColor) {
        removedStone++;
      }
      currentColor = stoneColor.charAt(i);
    }
    System.out.println(removedStone);
  }
}
