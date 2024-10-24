import java.util.Scanner;

/**
 * Pangram
 */
public class Pangram {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.next();
    System.out.println((scan.next().toLowerCase().chars().distinct().count() >= 26 ? "YES" : "NO"));
    scan.close();
  }
}
