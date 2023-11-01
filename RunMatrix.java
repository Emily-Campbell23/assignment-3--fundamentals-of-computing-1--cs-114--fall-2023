import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    String size;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the size of the matrix: ");

    size = scanner.nextLine();
    scanner.close();
  }
}
