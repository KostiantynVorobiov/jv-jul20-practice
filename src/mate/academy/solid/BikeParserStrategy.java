package mate.academy.solid;

import java.util.List;
import java.util.Map;

import mate.academy.solid.model.AbstractBike;
import mate.academy.solid.service.BikeParser;

public class BikeParserStrategy {
    private Map<String, BikeParser<? extends AbstractBike>> bikeParsers;

    // DI
    public BikeParserStrategy(Map<String, BikeParser<? extends AbstractBike>> bikeParsers) {
        this.bikeParsers = bikeParsers;
    }

    public AbstractBike getBike(List<String> row) {
        BikeParser<? extends AbstractBike> bikeParser = bikeParsers.get(row.get(0));
        if (bikeParser == null) {
            throw new RuntimeException("Can;t find correct parser for type: " + row.get(0));
        }
        return bikeParser.parse(row);
    }
}
