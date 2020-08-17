package mate.academy.exam.digits;

/**
 * What could be improved here?
 */
public class ArrayOfDigits1 {
  public static int[] toArrayOfDigits(int n) {
    String str = Integer.toString(n).replaceAll("\\D", "");
    char [] arr = str.toCharArray();
    int [] arrInt = new int [arr.length];
    for (int i = 0; i< arr.length; i++) {
      arrInt[i] = Character.getNumericValue(arr[i]);
    }
  for (int i= 0; i < arrInt.length/2; i++) {
    int temp = arrInt[i];
    arrInt[i] = arrInt[arrInt.length-1-i];
    arrInt[arrInt.length-1-i] = temp;
  }
    return arrInt;
  }

  public static int[] toArrayOfDigitsNew(int n) {
    if (n < 0) {
      n = n * -1;
    }
    int[] array = new int[String.valueOf(n).length()];

    return array;
  }
}
