import java.util.Scanner;

/**
 * UltraFastMathematician #61A
 */
public class UltraFastMathematician {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String fNum = scan.next();
    String sNum = scan.next();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < fNum.length(); i++) {
      if (fNum.charAt(i) == sNum.charAt(i)) {
        result.append('0');
      } else {
        result.append('1');
      }
    }
    System.out.println(result);
    scan.close();
  }
}
