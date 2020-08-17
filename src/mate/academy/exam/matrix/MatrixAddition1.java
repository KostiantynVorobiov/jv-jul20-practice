package mate.academy.exam.matrix;

public class MatrixAddition1 {
  public static int[][] addMatrix(int[][] first, int[][] second) {
    // write your code here
    if (first.length == 0) {
        return first;
    }
    int[][] resultedMatrix = new int[first.length][first[0].length];
    for (int i = 0; i < first.length; i++) {
        for (int j =0; j < first[i].length; j++) {
          resultedMatrix[i][j] = first[i][j] + second[i][j];
        }
    }
    return resultedMatrix;
  }

}
