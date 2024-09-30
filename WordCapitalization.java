import java.util.Scanner;

/**
 * WordCapitalization #281A
 */
public class WordCapitalization {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    scan.close();

    if (word.charAt(0) >= 65 && word.charAt(0) < 97) {
      System.out.println(word);
    } else {
      char c = (char) (word.charAt(0) - 32);

      String capitalWord = c + word.substring(1);

      System.out.println("\n" + capitalWord);
    }
  }
}
