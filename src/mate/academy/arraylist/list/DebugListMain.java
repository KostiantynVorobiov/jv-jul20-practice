package mate.academy.arraylist.list;

import java.util.ArrayList;
import java.util.List;

public class DebugListMain {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(3);
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400); // resize expected
    }
}
