import java.util.Scanner;

/*
 * BeautifulYear #271A
 * */
public class BeautifulYear {

  public static boolean hasDistinctDigits(int year) {
    boolean[] digitsSeen = new boolean[10];

    while (year > 0) {
      int digit = year % 10;
      if (digitsSeen[digit]) {
        return false;
      }
      digitsSeen[digit] = true;
      year /= 10;
    }
    return true;
  }

  public static int nextBeautifulYear(int year) {
    year++;
    while (!hasDistinctDigits(year)) {
      year++;
    }
    return year;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();

    int result = nextBeautifulYear(year);
    System.out.println(result);
  }
}
