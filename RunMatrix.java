// RunMatrix.java
import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the matrix using a positive number: ");
        int matrixSize = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Your matrix is " + matrixSize + " X " + matrixSize);
        System.out.println("Now printing matrix with default values...");

        Matrix size1 = new Matrix(matrixSize);

        scanner.close();
    }
}






//swap numbers
//print out flipped matrix
