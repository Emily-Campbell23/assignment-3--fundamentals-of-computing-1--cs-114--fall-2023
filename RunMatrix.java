import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Matrix size1;
    size1 = new Matrix();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the size of the matrix using a positive number: ");
    //size1 = scanner.nextLine();
    System.out.println("Your matrix is " + size1 + " X " + size1);
    System.out.println("Now printing matrix with default values...");
    scanner.close();
    }
  }

