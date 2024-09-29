import java.util.Scanner;
import static java.lang.Math.*;

/**
 * BeautifulMatrix
 */
public class BeautifulMatrix {
  static final int MATRIX_ROW = 5;
  static final int MATRIX_COLUMN = 5;
  static final int[] LOCK_BEAUTIFUL = { 3, 3 };

  static int[] onePostion = new int[2];
  static int[][] matrix = new int[MATRIX_ROW][MATRIX_COLUMN];

  static Scanner scan = new Scanner(System.in);

  static void getMatrix() {

    for (int i = 0; i < MATRIX_ROW; i++) {
      for (int j = 0; j < MATRIX_COLUMN; j++) {
        matrix[i][j] = scan.nextInt();
        if (matrix[i][j] == 1) {
          System.out.println(miniMove(i + 1, j + 1));
          scan.close();
          break;
        }
      }
    }
  }

  static int miniMove(int i, int j) {
    return abs(LOCK_BEAUTIFUL[0] - i) + abs(LOCK_BEAUTIFUL[1] - j);
  }

  public static void main(String[] args) {
    getMatrix();
  }
}
