package mate.academy.arraylist.list;

import java.util.List;

public class PrintService {
    public void printAll(List<String> strings) { // it's better to use abstraction, not certain implementation
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
