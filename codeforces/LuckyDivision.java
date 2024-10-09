import java.util.Scanner;

/**
 * LuckyDivision #122A
 */
public class LuckyDivision {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    scan.close();

    if (number % 74 == 0 || number % 47 == 0 || number % 4 == 0 || number % 7 == 0) {
      System.out.println("YES");
    } else {
      String num = String.valueOf(number);

      for (char c : num.toCharArray()) {
        if (c != '7' && c != '4') {
          System.out.println("NO");
          return;
        }
      }

      System.out.println("YES");
    }
  }

}
