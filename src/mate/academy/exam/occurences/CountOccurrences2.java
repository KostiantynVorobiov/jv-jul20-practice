package mate.academy.exam.occurences;

/**
 * Compare with solution CountOccurrences1
 */
public class CountOccurrences2 {
  public static int countOccurrences(String str, String substr) {
    // write code here
    int count =0;
    while (str.contains(substr)) {
      str = str.replaceFirst(substr, "");
      count++;
    }
    return count;
  }
}
