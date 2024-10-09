/*
 * Magnet #344A
 *
 */

import java.util.Scanner;

public class Magnets {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int groups = 1;
    String previousMagnet = scanner.next();

    for (int i = 1; i < n; i++) {
      String currentMagnet = scanner.next();

      if (!currentMagnet.equals(previousMagnet)) {
        groups++;
      }

      previousMagnet = currentMagnet;
    }

    System.out.println(groups);
    scanner.close();

  }
}
