import java.util.Scanner;

/**
 * AntonAndPolyhedrons #785A
 */
public class AntonAndPolyhedrons {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int polyhedronNumbers = scan.nextInt();

    int totalFaces = 0;

    for (int i = 0; i < polyhedronNumbers; i++) {
      String polyhedron = scan.next();
      // System.out.print(polyhedron + " ");
      if (polyhedron.equals("Tetrahedron"))
        totalFaces += 4;
      if (polyhedron.equals("Cube"))
        totalFaces += 6;
      if (polyhedron.equals("Octahedron"))
        totalFaces += 8;
      if (polyhedron.equals("Dodecahedron"))
        totalFaces += 12;
      if (polyhedron.equals("Icosahedron"))
        totalFaces += 20;
    }

    System.out.println(totalFaces);
    scan.close();
  }
}
