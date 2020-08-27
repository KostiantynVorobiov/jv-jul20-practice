package mate.academy.fruitshop.service;

import mate.academy.fruitshop.Storage;
import mate.academy.fruitshop.model.Fruit;

public class SupplyFruitOperation implements FruitOperation {
    private Storage storage;

    public SupplyFruitOperation(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void apply(Fruit fruit) {
        storage.add(fruit);
    }
}
