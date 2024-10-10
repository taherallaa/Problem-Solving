import java.util.Arrays;
import java.util.Scanner;

/**
 * Twins #160A
 */
public class Twins {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int coinNumber = scan.nextInt();

    int[] coins = new int[coinNumber];
    int totalCoins = 0;

    for (int i = 0; i < coinNumber; i++) {
      int coin = scan.nextInt();
      coins[i] = coin;
      totalCoins += coin;
    }

    Arrays.sort(coins);
    int coinCount = 0;
    int selectCoinSum = 0;

    for (int i = coinNumber - 1; i >= 0; i--) {
      selectCoinSum += coins[i];
      coinCount++;
      if (selectCoinSum > totalCoins - selectCoinSum) {
        break;
      }
    }
    System.out.println(coinCount);
    scan.close();
  }
}
