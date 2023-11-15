// Matrix.java
public class Matrix {
    int size;
    int[][] matrix;

    // Constructor should have the same name as the class (capitalized)
    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        // Indicate that we are now populating the matrix
        System.out.println("Now populating matrix...");

        // Populate the matrix with 1 - (size * size) and highlight the diagonal from lower left to upper right
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (height + width == size - 1) {
                    // Highlight the diagonal with light green background
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m");
                } else {
                    matrix[height][width] = 0;
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }

        // Separate the two matrices with a line
        System.out.println("Second Matrix:");

        // Populate the second matrix with the same formula (1 - (size * size)) and highlight exactly the same way as the first one
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (height + width == size - 1) {
                    // Highlight the diagonal with light green background
                    System.out.print("\u001B[42m" + (1 - (size * size)) + "\t\u001B[0m");
                } else {
                    matrix[height][width] = 1 - (size * size);
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }
    }
}
