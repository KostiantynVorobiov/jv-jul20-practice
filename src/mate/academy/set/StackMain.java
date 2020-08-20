package mate.academy.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StackMain {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        Integer element = stack.pop();
//        System.out.println(element);

        List<Integer> list2 = new ArrayList<>(List.of(5, 3, 5, 23, 6, 14, 11, 19, 7));
        list2.sort(Comparator.comparingInt(Integer::valueOf));
        list2.sort(Comparator.comparingInt(list2::get));
    }
}
