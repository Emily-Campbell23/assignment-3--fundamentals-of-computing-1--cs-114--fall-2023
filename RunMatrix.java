import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the size of the matrix using a positive number: ");

    size = scanner.nextInt();

    System.out.println("Your matrix is " + size + " X " + size);
    System.out.println("Now printing matrix with default values...");


    int[][] matrix = new int[size][size];
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = (0) + col;
      }
    }
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print (matrix[0][0] + "\t");
      }
      System.out.println();
    scanner.close();
    }
  }
}
