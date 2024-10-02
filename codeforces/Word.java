import java.util.Scanner;

/**
 * Word #59A
 */
public class Word {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    scan.close();

    int lowerCharCount = 0;
    int upperCharCount = 0;

    for (int i = 0; i < word.length(); i++) {

      if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
        upperCharCount++;
      } else {
        lowerCharCount++;
      }
    }

    if (upperCharCount == lowerCharCount || lowerCharCount > upperCharCount) {
      System.out.println(word.toLowerCase());
    } else
      System.out.println(word.toUpperCase());
  }

  // to ensure time and space complixty:
  // my code is --> 592 ms, 900kb
  // gpt --> 500 ms, 1000kb
  public static void anotherSolutionFromGpt() {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    scan.close();

    int lowerCharCount = 0;
    int upperCharCount = 0;

    for (char c : word.toCharArray()) {
      if (Character.isLowerCase(c))
        lowerCharCount++;
      else
        upperCharCount++;
    }

    StringBuilder result = new StringBuilder(word.length());

    if (upperCharCount == lowerCharCount || lowerCharCount > upperCharCount) {
      for (char c : word.toCharArray()) {
        result.append(Character.toLowerCase(c));
      }
    } else {
      for (char c : word.toCharArray()) {
        result.append(Character.toUpperCase(c));
      }
    }
    System.out.println(result);
  }
}
