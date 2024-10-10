import java.util.Scanner;

/**
 * EasyProblem #1030A
 */
public class EasyProblem {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int numAskedPeopole = scan.nextInt();

    for (int i = 0; i < numAskedPeopole; i++) {
      if (scan.nextInt() == 1) {
        System.out.println("HARD");
        return;
      }
    }
    System.out.println("EASY");
    scan.close();
  }

}
