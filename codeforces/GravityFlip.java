import java.util.Arrays;
import java.util.Scanner;

/**
 * GravityFlip #405A
 */
public class GravityFlip {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int columnNumber = scan.nextInt();

    int[] cubes = new int[columnNumber];

    for (int i = 0; i < columnNumber; i++) {
      cubes[i] = scan.nextInt();
    }

    Arrays.sort(cubes);

    for (int i = 0; i < columnNumber; i++) {
      System.out.print(cubes[i] + " ");
    }

    scan.close();
  }
}
