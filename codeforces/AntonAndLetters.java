import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * AntonAndLetters #443A
 */
public class AntonAndLetters {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String letters = scan.nextLine().replaceAll("\\s", "");

    scan.close();

    int lettersSize = letters.length();
    Set<Character> distinctLetters = new HashSet<>();

    if (lettersSize == 2)
      System.out.println(0);
    else if (lettersSize == 3)
      System.out.println(1);
    else {

      for (int i = 1; i <= lettersSize - 1; i += 2) {
        distinctLetters.add(letters.charAt(i));
      }

      System.out.println(distinctLetters.size());
    }
  }
}
