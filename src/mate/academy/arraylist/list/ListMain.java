package mate.academy.arraylist.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Z");
        stringList.add("Y");
        stringList.add("X");

        String[] strings = new String[3];
        strings[0] = "A";
        strings[1] = "B";
        strings[2] = "C";
        // strings[3] = "D"; // index out of bound exception

        stringList.remove(1);
        stringList.add("W");

        fill(stringList);
        // stringList.trimToSize(); // available only for ArrayList, not for List

        PrintService printService = new PrintService();
        printService.printAll(stringList);

        List<String> stringLinkedList = new LinkedList<>();
        fill(stringLinkedList);
        printService.printAll(stringLinkedList);

        String max = Collections.max(stringLinkedList); // example of using abstraction in collections class
    }

    public static void fill(List<String> list) { // it's better to use abstraction, not certain implementation
        list.add("A");
        list.add("B");
        list.add("C");
    }
}
