import java.util.Scanner;
import static java.lang.Math.*;

/**
 * HelpfulMaths-339A
 */
public class HelpfulMaths {
  // + ==> 43;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    scan.close();

    if (s.length() == 1) {
      System.out.println(s);
    } else {
      int oneCount = 0;
      int twoCount = 0;
      int threeCount = 0;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '2')
          twoCount++;
        if (s.charAt(i) == '1')
          oneCount++;
        if (s.charAt(i) == '3')
          threeCount++;
      }

      StringBuilder res = new StringBuilder();
      //
      // 0 0 2
      for (int i = 0; i < ceil(s.length() / 2) + 1; i++) {
        if (oneCount != 0) {
          res.append("1+");
          oneCount--;
          continue;
        }
        if (twoCount != 0) {
          res.append("2+");
          twoCount--;
          continue;
        }
        if (threeCount != 0) {
          res.append("3+");
          threeCount--;
        }
      }
      res.replace(res.length() - 1, res.length() + 1, " ");

      System.out.println(res);
    }
  }

}
