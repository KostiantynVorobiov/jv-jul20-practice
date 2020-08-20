package mate.academy.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import mate.academy.exam.User;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>(new CustomIntegerComparator());
        integers.add(10);
        integers.add(5);
        integers.add(20);
        integers.add(null);
        // System.out.println(integers);

        Set<User> users = new TreeSet<>();
        users.add(new User("Bob", "Nilson"));
        users.add(new User("Alice", "Nilson"));
        users.add(new User("Bob", "Catson"));
        System.out.println(users);

        Set<Car> cars = new TreeSet<>();
        cars.add(new Car(2020, "Q7"));
        cars.add(new Car(2019, "X5"));
        System.out.println(cars);
    }
}

class CustomIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        // return (-1) * Integer.compare(o1, o2);
        return Integer.compare(o2, o1);
    }
}
