import java.util.Scanner;

/**
 * Tram
 */
public class Tram {
  public static void gptSolution() {

    Scanner scan = new Scanner(System.in);
    scan.close();

    int numTramStation = scan.nextInt();

    int currentPassengers = 0;
    int minimumCapacity = 0;

    for (int i = 0; i < numTramStation; i++) {
      int exit = scan.nextInt();
      int enter = scan.nextInt();

      currentPassengers = enter + (currentPassengers - exit);

      if (currentPassengers > minimumCapacity) {
        minimumCapacity = currentPassengers;
      }
    }

    System.out.println(minimumCapacity);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numTramStation = scan.nextInt();

    int[][] passengerStatus = new int[numTramStation][2];

    for (int i = 0; i < numTramStation; i++) {
      for (int j = 0; j < 2; j++) {
        passengerStatus[i][j] = scan.nextInt();
      }
    }
    scan.close();

    int currentPassengers = 0;

    int minimumCapacity = 0;

    int exit = 0;
    int enter = 0;

    for (int i = 0; i < numTramStation; i++) {
      for (int j = 0; j < 1; j++) {
        exit = passengerStatus[i][j];
        enter = passengerStatus[i][j + 1];
      }

      currentPassengers = enter + (currentPassengers - exit);
      if (currentPassengers > minimumCapacity) {
        minimumCapacity = currentPassengers;
      }
    }

    System.out.println(minimumCapacity);
  }
}
