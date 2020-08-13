package mate.academy.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableMain {
    public static void main(String[] args) {
        List<String> owners = new ArrayList<>();
        Car audi = new Car("Q7", 2020, new Engine(100, "D"), owners);
        owners.add("Bohdan");
        owners.add("Vova");

        Map<Car, String> carMap = new HashMap<>();
        carMap.put(audi, "Hello audi");

        System.out.println(carMap.get(audi));

        List<String> ownersBmw = new ArrayList<>();
        Car bmw = new Car("Q7", 2020, new Engine(100, "D"), ownersBmw);
        ownersBmw.add("Bohdan");
        ownersBmw.add("Vova");

        System.out.println(audi.equals(bmw));

        System.out.println(carMap.get(bmw));

        ownersBmw.add("Vika");
        bmw.getEngine().setType("E");
        bmw.getOwners().add("Dima");
        System.out.println(carMap.get(bmw));
        System.out.println(carMap.get(audi));

        System.out.println(bmw.hashCode());
        System.out.println(audi.hashCode());
    }
}
