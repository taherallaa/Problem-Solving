import java.util.Scanner;

/**
 * ChatRoom #58A
 */
public class ChatRoom {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.next();
    scan.close();

    String target = "hello";
    int pointer = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == target.charAt(pointer))
        pointer++;
      if (pointer == target.length()) {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");

  }

}
