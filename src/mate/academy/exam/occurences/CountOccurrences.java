package mate.academy.exam.occurences;

public class CountOccurrences {
    public static int countOccurrences(String str, String substr) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replacedString = str.replaceAll(substr, "");
        return (str.length() - replacedString.length()) / substr.length();
        // abcabcbc --> bc : "" ---> aa
    }
}
