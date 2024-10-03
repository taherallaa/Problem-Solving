import java.util.Scanner;

/**
 * Football #96A
 */
public class Football {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String playerPostion = scan.next();

    scan.close();

    int zeroCount = 0;
    int oneCount = 0;

    for (char c : playerPostion.toCharArray()) {
      if (c == '0') {
        if (zeroCount != 7 && oneCount != 7) {
          oneCount = 0;
          zeroCount++;
        } else {
          System.out.println("YES");
          return;
        }

      } else {
        if (oneCount != 7 || zeroCount != 8) {
          oneCount++;
          zeroCount = 0;
        } else {
          System.out.println("YES");
          return;
        }
      }
    }

    System.out.println("NO");
  }
}
