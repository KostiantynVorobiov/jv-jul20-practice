package mate.academy.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharMapMain {
    // Частота появи символу чи слова у тексті.
    // Слово чи символ це key, а частота появи це value.

    // hello world mate academy
    // h : 1
    // e : 3
    // ...

    public static void main(String[] args) {
        String line = "hello world mate academy";
        // 1. get char array from string
        // 2. create map
        // 3. with loop - iterate over char array
        // and add values into hashmap properly

        char[] chars = line.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else  {
                charMap.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey().toString().toUpperCase() + " : " + entry.getValue());
            }
        }
    }
}
