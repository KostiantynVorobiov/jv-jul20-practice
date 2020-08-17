package mate.academy.exam.prettyarray;

public class PrettyArray1 {
  public static boolean isArrayPretty(int[] array) {
    if (array.length == 0 || array.length == 1) {
      return false;
    }
    for (int i = 1; i < array.length-1; i++) {
        int currentElement = array[i];

        int lastElement = array[array.length - 1];
        if (i == 0) {
        if (!(currentElement == lastElement - 1 || currentElement == array[1] + 1
            || currentElement == lastElement + 1 || currentElement == array[1] - 1)) {
            return false;
         }
       }
      if (i == array.length-1) {
         if (!(currentElement == (lastElement -1) || currentElement == array[0] + 1
            || currentElement == (lastElement + 1) || currentElement == array[0] - 1 )) {
            return false;
        }
      }

      if(!(currentElement == array[i-1] - 1 || currentElement == array[i+1] + 1
            || currentElement == array[i-1] + 1 || currentElement == array[i+1] - 1)) {
            return false;
          }
        }
    return true;
  }


  public void printUppercase(String value) {
      if (!isEmpty(value)) {
          System.out.println(value.toUpperCase());
      }

      if (isNotEmpty(value)) {
          System.out.println(value.toUpperCase());
      }
  }

    private boolean isNotEmpty(String value) {
        return false;
    }

    private boolean isEmpty(String value) {
      return value == null || value.equals("");
  }
}
