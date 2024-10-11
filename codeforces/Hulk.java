import java.util.Scanner;

/**
 * Hulk #A
 */
public class Hulk {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int layers = scan.nextInt();

    StringBuilder result = new StringBuilder();

    for (int i = 1; i <= layers; i++) {
      if (i % 2 == 0) {
        result.append("I love ");
        if (i == layers) {
          result.append("it ");
        } else {
          result.append("that ");
        }
      } else {
        result.append("I hate ");
        if (i == layers) {
          result.append("it ");
        } else {
          result.append("that ");
        }
      }
    }

    System.out.println(result);
    scan.close();
  }

}
