import java.util.Scanner;

public class RunMatrix{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix with only positive numbers: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Invalid size. Please enter a positive number.");
        }
        else{
            Matrix matrix = new Matrix(size);
            matrix.printMatrix();
        }
        scanner.close();
    }
}
