import java.util.Scanner;

/**
 * YoungPhysicist #69A
 */
public class YoungPhysicist {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int LINE = scan.nextInt();

    int[] idelBody = { 0, 0, 0 };

    for (int i = 0; i < LINE; i++) {
      for (int j = 0; j < 3; j++) {
        idelBody[j] += scan.nextInt();
      }
    }

    scan.close();

    for (int i : idelBody) {
      if (i != 0) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
