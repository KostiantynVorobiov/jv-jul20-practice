package mate.academy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Mate");

        System.out.println("Iterator example: ");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.startsWith("H")) {
                iterator.remove();
            }
        }

        for (String value: stringSet) {
            System.out.println(value);
        }
    }
}
