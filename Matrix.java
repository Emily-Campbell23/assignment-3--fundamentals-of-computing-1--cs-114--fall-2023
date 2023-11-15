// Matrix.java
public class Matrix {
    int size;
    int[][] matrix;

    // Constructor should have the same name as the class (capitalized)
    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        // Populate the matrix with 0s, highlighting the diagonal with light green
        for (int height = 0; height < matrix.length; height++) {
            for (int width = 0; width < matrix[height].length; width++) {
                if (height + width == size - 1) {
                    // Highlight the diagonal by setting diagonal elements to 0 with light green background
                    matrix[height][width] = 0;
                    System.out.print("\u001B[42m" + matrix[height][width] + "\t\u001B[0m");
                } else {
                    matrix[height][width] = 0;
                    System.out.print(matrix[height][width] + "\t");
                }
            }
            System.out.println();
        }
    }
}
