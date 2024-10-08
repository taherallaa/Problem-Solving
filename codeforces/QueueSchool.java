import java.util.Scanner;

/**
 * QueueSchool #266B
 */
public class QueueSchool {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int childernNumber = scan.nextInt();
    int time = scan.nextInt();

    String childArragement = scan.next();
    char[] childQueue = childArragement.toCharArray();

    scan.close();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < time; i++) {
      for (int j = 0; j < childernNumber - 1; j++) {
        int first = j;
        int second = j + 1;

        if (childQueue[first] == 'B' && childQueue[second] == 'G') {
          char temp = childQueue[first];
          childQueue[first] = childQueue[second];
          childQueue[second] = temp;
          j++;
        }
      }
    }

    System.out.println(new String(childQueue));
  }
}
