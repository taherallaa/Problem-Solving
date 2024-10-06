import java.util.Scanner;

/**
 * AntonAndDanik #734A
 */
public class AntonAndDanik {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int gamesNumber = scan.nextInt();
    String gameOutcome = scan.next();

    scan.close();

    int ratio = gamesNumber / 2;
    int antonScore = 0;
    int danikScore = 0;

    for (char c : gameOutcome.toCharArray()) {
      if (c == 'A') {
        if (++antonScore > ratio) {
          System.out.println("Anton");
          return;
        }
      } else {
        if (++danikScore > ratio) {
          System.out.println("Danik");
          return;
        }
      }
    }
    System.out.println("Friendship");
  }
}
