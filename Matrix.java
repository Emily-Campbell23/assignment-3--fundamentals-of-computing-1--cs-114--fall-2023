import java.util.Scanner;

public class Matrix {
    int size;
    int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        System.out.println("Printing Matrix with default values...");

        // Populate the first matrix with all 0s
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (width == size - height - 1) {
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m"); // highlights the diagonal in light green
                } else {
                    matrix[height][width] = 0;
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("\nPopulating matrix:");

        int count = 1;
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                matrix[height][width] = count++;
            }
        }

        // Print the second matrix with elements flipped (excluding highlighted diagonal)
        printFlippedMatrix();

        System.out.println("\nPrinting swapped Matrix:");

        // Swap the contents of one side of the diagonal with the other side, leaving the highlighted diagonal unchanged
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (width == size - height - 1) {
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m"); // highlights diagonal with light green background
                } else {
                    // Use your logic to flip all numbers except the highlighted diagonal
                    System.out.print(matrix[matrix.length - 1 - height][matrix[height].length - 1 - width] + "\t");
                }
            }
            System.out.println();
        }
    }

    // print the second matrix with elements flipped (excluding highlighted diagonal)
    private void printFlippedMatrix() {
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (width == size - height - 1) {
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m"); // highlights diagonal with light green background
                } else {
                    // Use your logic to flip all numbers except the highlighted diagonal
                    System.out.print(matrix[matrix.length - 1 - height][matrix[height].length - 1 - width] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        System.out.println("Your matrix is " + size + " X " + size);
        Matrix matrix = new Matrix(size);
        scanner.close();
    }
}
