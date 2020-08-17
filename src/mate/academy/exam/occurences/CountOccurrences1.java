package mate.academy.exam.occurences;

/**
 * Using substring
 */
public class CountOccurrences1 {
  public static int countOccurrences(String str, String substr) {
    int count = 0;
    int position = str.indexOf(substr);
    while (position >= 0) {
      count = count + 1;
      str = str.substring(position + 1);
      position = str.indexOf(substr);
    }
    return count;
  }
}
