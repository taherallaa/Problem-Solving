import java.util.Scanner;

/**
 * Horseshoe #228A
 */
public class Horseshoe {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] color = new int[4];
    int colorCount = 4;

    for (int i = 0; i < 4; i++) {
      color[i] = scan.nextInt();
    }

    for (int i = 0; i < 4; i++) {
      for (int j = i + 1; j < 4; j++) {
        if (color[i] == color[j]) {
          colorCount--;
          break;
        }
      }
    }
    System.out.println(4 - colorCount);
    scan.close();
  }
}
