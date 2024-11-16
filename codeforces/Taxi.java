import java.util.Scanner;

/**
 * Taxi #158B
 */
public class Taxi {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int groupNumber = scan.nextInt();

    int groupOne = 0;
    int groupTwo = 0;
    int groupThree = 0;
    int groupFour = 0;

    for (int i = 0; i < groupNumber; i++) {
      int n = scan.nextInt();
      switch (n) {
        case 1:
          groupOne++;
          break;
        case 2:
          groupTwo++;
          break;
        case 3:
          groupThree++;
          break;
        case 4:
          groupFour++;
          break;
        default:
          break;
      }
    }

    int totalTax = 0;

    // 5 1 2 1
    totalTax = groupFour + groupThree + groupTwo / 2;
    groupOne -= Math.min(groupThree, groupOne);

    if (groupTwo % 2 == 1) {
      totalTax++;
      groupOne -= 2;
    }

    if (groupOne > 0) {
      totalTax += (groupOne + 3) / 4;
    }

    System.out.println(totalTax);
    scan.close();
  }
}
