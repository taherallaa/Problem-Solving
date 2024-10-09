import java.util.Scanner;

/**
 * GeorgeAccommodation #467A
 */
public class GeorgeAccommodation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int romNumber = scan.nextInt();

    int availableRoom = 0;

    for (int i = 0; i < romNumber; i++) {
      int livePeople = scan.nextInt();
      int romCapacity = scan.nextInt();

      int availablePlace = romCapacity - livePeople;

      if (availablePlace >= 2) {
        availableRoom++;
      }
    }
    System.out.println(availableRoom);
    scan.close();
  }
}
