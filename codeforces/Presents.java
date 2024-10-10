import java.util.Scanner;

/**
 * Presents #136A
 */
public class Presents {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int friendNumber = scan.nextInt();
    int[] friends = new int[friendNumber];

    for (int i = 0; i < friendNumber; i++) {
      friends[scan.nextInt() - 1] = i + 1;
    }

    for (int i = 0; i < friendNumber; i++) {
      System.out.print(friends[i] + " ");
    }

    scan.close();
  }
}
