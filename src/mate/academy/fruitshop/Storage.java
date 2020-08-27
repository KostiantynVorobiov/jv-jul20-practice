package mate.academy.fruitshop;

import java.util.ArrayList;
import java.util.List;

import mate.academy.fruitshop.model.Fruit;


public class Storage {
    List<Fruit> fruits = new ArrayList<>();

    public void add(List<Fruit> fruits) {
        fruits.addAll(fruits);
    }
    public void add(Fruit fruit) {
        fruits.add(fruit);
    }
}
