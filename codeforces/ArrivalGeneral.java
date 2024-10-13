import java.util.Scanner;

/**
 * ArrivalGeneral #144A
 */
public class ArrivalGeneral {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int soldiersNumber = scan.nextInt();
    int[] soliderHeight = new int[soldiersNumber];

    for (int i = 0; i < soldiersNumber; i++) {
      soliderHeight[i] = scan.nextInt();
    }

    int high = soliderHeight[0];
    int small = soliderHeight[soldiersNumber - 1];

    int highPosition = 1;
    int smallPosition = soldiersNumber;

    for (int i = 0; i < soldiersNumber; i++) {

      if (high == soliderHeight[i]) {
        if (i + 1 < highPosition) {
          highPosition = i + 1;
        }
      }

      if (high < soliderHeight[i]) {
        high = soliderHeight[i];
        highPosition = i + 1;
      }

      if (small == soliderHeight[i]) {
        if (i + 1 > smallPosition) {
          smallPosition = i + 1;
        }
      }

      if (small > soliderHeight[i]) {
        small = soliderHeight[i];
        smallPosition = i + 1;
      }
    }

    int second = (highPosition - 1) + (soldiersNumber - smallPosition);

    if (soldiersNumber == 2 && highPosition > smallPosition) {
      System.out.println("1");
    } else if (highPosition == 1 && smallPosition == soldiersNumber) {
      System.out.println("0");
    } else if (highPosition > smallPosition) {
      System.out.println(second - 1);
    } else {
      System.out.println(second);
    }

    scan.close();
  }
}
