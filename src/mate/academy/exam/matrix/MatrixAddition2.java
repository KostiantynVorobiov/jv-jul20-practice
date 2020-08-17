package mate.academy.exam.matrix;

/**
 * What is not OK here?
 */
public class MatrixAddition2 {
  public static int[][] addMatrix(int[][] first, int[][] second) {
    int l1 = first.length;
    if (l1 == 0) {
      return new int[0][0];
    }
    int l2 = first[0].length;
    for (int i = 0; i < l1; i++) {
      for (int j = 0; j < l2; j++) {
        first[i][j] += second[i][j];
      }
    }
    return first;
  }
}
