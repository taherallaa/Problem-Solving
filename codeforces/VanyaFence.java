import java.util.Scanner;

/**
 * VanyaFence #677A
 */
public class VanyaFence {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int numPersons = scan.nextInt();
    int fenceHeight = scan.nextInt();

    int miniWidth = 0;

    while (numPersons-- != 0) {
      int personHeight = scan.nextInt();

      if (personHeight > fenceHeight) {
        miniWidth += 2;
      } else {
        miniWidth++;
      }
    }

    System.out.println(miniWidth);
  }
}
