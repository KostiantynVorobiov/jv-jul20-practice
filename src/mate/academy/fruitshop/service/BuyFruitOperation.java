package mate.academy.fruitshop.service;

import mate.academy.fruitshop.Storage;
import mate.academy.fruitshop.model.Fruit;

public class BuyFruitOperation implements FruitOperation {
    private Storage storage;
    @Override
    public void apply(Fruit fruit) {
        storage.add(fruit); // remove
    }
}
