import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
