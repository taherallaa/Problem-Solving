import java.util.Scanner;

/**
 * LuckyNumber #110A
 */
public class LuckyNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String number = scan.next();
    scan.close();

    int luckyCount = 0;

    for (char c : number.toCharArray()) {
      if (c == '7' || c == '4')
        luckyCount++;
    }

    if (luckyCount == 7 || luckyCount == 4) {
      System.out.println("YES");
    } else
      System.out.println("NO");
  }
}
