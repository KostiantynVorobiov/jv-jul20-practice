package mate.academy.exam.digits;

import java.util.Arrays;

public class ArrayOfDigitsOk {
  public static int[] toArrayOfDigits(int n) {
    n = Math.abs(n);
    int[] result = new int[(n + "").length()];
    for (int i = 0; i < result.length; i++) {
      result[i] = n % 10;
      n = n / 10;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] ints = toArrayOfDigits(13456);
    System.out.println(Arrays.toString(ints));
  }
}
