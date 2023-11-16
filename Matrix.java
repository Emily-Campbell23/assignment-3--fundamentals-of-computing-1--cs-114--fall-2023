import java.util.Scanner;
/* GOAL: ask user for input which becomes the size of the matrix, populate all 0s, highlight diagonal
 * print matrix with numbers incrementing by 1
 * print swapped matrix with the diagonal being untouched
 */
public class Matrix{
    private int[][] matrix;

    public Matrix(int size){
        this.matrix = new int[size][size];

        System.out.println("Matrix dimensions: " + size + " X " + size);
        printMatrixWithDefaultValues();
        populateMatrix();
        flipMatrix();
        printFlippedMatrix();
    }

    private void swap(int x1, int y1, int x2, int y2){
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    public void printMatrix(){
        System.out.println("\nPrinting Matrix:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(col == matrix.length - row - 1) {
                    System.out.print("\u001B[33m" + matrix[row][col] + "\t\u001B[0m"); // highlights the diagonal in yellow
                }
                else{
                    System.out.print(matrix[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void populateMatrix(){
        int count = 1;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = count++;
            }
        }
    }

    public void flipMatrix(){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(col != matrix.length - row - 1){
                    swap(row, col, matrix.length - 1 - col, matrix.length - 1 - row);
                }
            }
        }
    }

    private void printMatrixWithDefaultValues(){
        System.out.println("Printing Matrix with default values:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(col == matrix.length - row - 1){
                    System.out.print("\u001B[33m" + matrix[row][col] + "\t\u001B[0m"); // highlights the diagonal in yellow
                }
                else{
                    matrix[row][col] = 0;
                    System.out.print(matrix[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }

    private void printFlippedMatrix(){
        System.out.println("\nPrinting Flipped Matrix:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(col == matrix.length - row - 1){
                    System.out.print("\u001B[33m" + matrix[row][col] + "\t\u001B[0m"); // highlights the diagonal in yellow
                }
                else{
                    System.out.print(matrix[matrix.length - 1 - row][matrix[row].length - 1 - col] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix using positive numbers: ");
        int size = scanner.nextInt();
        Matrix matrix = new Matrix(size);
        matrix.printMatrix();
        scanner.close();
    }
}
