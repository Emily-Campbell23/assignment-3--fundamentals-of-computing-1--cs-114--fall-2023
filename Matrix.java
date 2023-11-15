import java.util.Scanner;

public class Matrix {
    int size;
    int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        System.out.println("Printing Matrix with default values...");

        // Populate the first matrix with all 0s and highlight the diagonal from lower left to upper right
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (width == size - height - 1) {
                    // Highlight the diagonal with light green background
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m");
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

        // Print the second matrix with the diagonal highlighted from lower left to upper right
        printMatrixFromLowerLeftToUpperRight();

        System.out.println("\nPrinting flipped Matrix:");

        count = size * size;
        for (int height = matrix.length - 1; height >= 0; height--) {
            for (int width = matrix[height].length - 1; width >= 0; width--) {
                matrix[height][width] = count--;
            }
        }

        // Print the third matrix with the highlighted diagonal unchanged and other numbers flipped
        printFlippedMatrixFromLowerLeftToUpperRight();
    }

    // Method to print the matrix with the diagonal highlighted from lower left to upper right
    private void printFlippedMatrixFromLowerLeftToUpperRight() {
        for (int height = matrix.length - 1; height >= 0; height--) {
            for (int width = matrix[height].length - 1; width >= 0; width--) {
                // Highlight the diagonal from lower left to upper right with light green background
                if (width == size - height - 1) {
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m");
                } else {
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }
    }

    // Method to print the matrix with the diagonal highlighted from lower left to upper right
    private void printMatrixFromLowerLeftToUpperRight() {
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                // Highlight the diagonal from lower left to upper right with light green background
                if (width == size - height - 1) {
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m");
                } else {
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the matrix size from the user
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        System.out.println("Your matrix is " + size + " X " + size);
        // Example usage with user input
        Matrix matrix = new Matrix(size);

        // Close the scanner
        scanner.close();
    }
}
