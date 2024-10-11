import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * HQ9+ #133A
 */
public class Hq9 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String program = scan.next();

    scan.close();

    Set<Character> token = new HashSet<>();
    token.add('H');
    token.add('Q');
    token.add('9');
    token.add('+');

    for (char c : program.toCharArray()) {
      if (c == '+')
        continue;
      if (token.contains(c)) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");

  }

}
