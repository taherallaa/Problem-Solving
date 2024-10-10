import java.util.Scanner;

/**
 * OrangeDrinks #318A
 */
public class OrangeDrinks {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double drinksNumber = scan.nextDouble();

    int orangePercentTotal = 0;
    for (int i = 0; i < drinksNumber; i++) {
      orangePercentTotal += scan.nextInt();
    }

    System.out.println(orangePercentTotal / drinksNumber);
    scan.close();
  }
}
