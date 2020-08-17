package mate.academy.exam.prettyarray;

public class PrettyArray2 {
  public static boolean isArrayPretty(int[] array) {
    if (array.length == 0) {
      return false;
    }
    int countPretty = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j] - 1 || array[i] == array[j] + 1) {
          countPretty++;
          break;
        }
      }
    }
    return countPretty == array.length;
  }

  // Arrays.sort(array) ---> 2, 9, 10, 3
}
