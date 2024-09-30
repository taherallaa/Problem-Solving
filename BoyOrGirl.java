import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * BoyOrGirl #236A
 */
public class BoyOrGirl {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String name = scan.next();
    scan.close();

    Set<Character> charCount = new HashSet<>();

    for (char chr : name.toCharArray()) {
      charCount.add(chr);
    }

    if (charCount.size() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}
