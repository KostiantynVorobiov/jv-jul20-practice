package mate.academy.exam.matrix;

public class MatrixAddition3 {
  public static int[][] addMatrix(int[][] first, int[][] second) {


           if (first.length  == 0 && second.length == 0)
           return new int[0][0];
           int [][] result = new int [first.length][first[0].length];
        for (int i = 0; i < first.length; i++)
            for (int j = 0; j < first[0].length; j++)
                result[i][j] = first[i][j] + second[i][j];
    return result;
  }
}
