import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * StringTask #118A
 */
public class StringTask {

  public static void main(String[] argv) {
    Scanner scan = new java.util.Scanner(System.in);
    String input = scan.next();
    scan.close();

    Set<Character> vowels = new HashSet<>();

    vowels.add('A');
    vowels.add('a');
    vowels.add('O');
    vowels.add('o');
    vowels.add('Y');
    vowels.add('y');
    vowels.add('E');
    vowels.add('e');
    vowels.add('U');
    vowels.add('u');
    vowels.add('I');
    vowels.add('i');

    String solution = "";

    for (int i = 0; i < input.length(); i++) {

      if (vowels.contains(input.charAt(i))) {
        continue;
      } else if (input.charAt(i) >= 65 && input.charAt(i) <= 97) {

        char smallChar = (char) (input.charAt(i) + 32);

        solution += "." + smallChar;

      } else {
        solution += "." + input.charAt(i);
      }

    }

    System.out.println(solution);
  }

}
