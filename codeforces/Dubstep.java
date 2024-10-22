import java.util.Scanner;

/**
 * Dubstep #208A
 */
public class Dubstep {
  public static String removePattern(String word) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    boolean prevWub = false;

    while (i < word.length()) {
      if (i + 2 < word.length() && word.charAt(i) == 'W' && word.charAt(i + 1) == 'U' && word.charAt(i + 2) == 'B') {
        if (!prevWub && result.length() > 0) {
          result.append(' ');
        }
        prevWub = true;
        i += 3;
      } else {
        result.append(word.charAt(i));
        prevWub = false;
        i++;
      }

    }
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String dubsetSont = scan.next();
    System.out.println(dubsetSont.replaceAll("WUB", " "));
    System.out.println(removePattern(dubsetSont));
    scan.close();
  }
}
