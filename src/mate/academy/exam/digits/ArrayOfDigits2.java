package mate.academy.exam.digits;

/**
 * What is not OK here?
 */
public class ArrayOfDigits2 {
    public static int[] toArrayOfDigits(int n) {
        // write code here
        if (n < 0) {
            n = n * -1;
        }
        String number = String.valueOf(n);
        int[] array = new int[number.length()];
        for (int i = number.length() - 1, j = 0; i >= 0; i--, j++) {
            array[j] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return array;
    }
}
