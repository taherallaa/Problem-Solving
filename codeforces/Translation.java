import java.util.Scanner;

/**
 * Translation #41A
 */
public class Translation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    String targetWord = scan.next();
    StringBuilder translationWord = new StringBuilder();

    for (int i = word.length() - 1; i >= 0; i--) {
      translationWord.append(word.charAt(i));
    }

    if (translationWord.toString().equals(targetWord)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    scan.close();
  }
}
