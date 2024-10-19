import java.util.Scanner;

/**
 * HitLottery
 */
public class HitLottery {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int dollars = scan.nextInt();
    int[] bills = { 100, 20, 10, 5, 1 };
    int billCounts = 0;

    for (int bill : bills) {
      billCounts += dollars / bill;
      dollars %= bill;
    }

    System.out.println(billCounts);
    scan.close();
  }
}
