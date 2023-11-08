public class Matrix {
  int size;
  public int matrix() {
    int[][] matrix = new int[size][size];{
    for (int height = 0; height < matrix.length; height++) {
      for (int width = 0; width < matrix[height].length; width++) {
        matrix[height][width] = (0) + width;
      }
    }
    for (int height = 0; height < matrix.length; height++) {
      for (int width = 0; width < matrix[height].length; width++) {
        System.out.print(matrix[0][0] + "\t");
      }
      System.out.println();
      }
    }
    return matrix();
  }
}
