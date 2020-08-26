package mate.academy.solid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mate.academy.solid.model.AbstractBike;
import mate.academy.solid.service.BikeParser;
import mate.academy.solid.service.FileService;
import mate.academy.solid.service.impl.FileServiceImpl;

public class Main {
    public static void main(String[] args) {
        Map<String, BikeParser<? extends AbstractBike>> parsersMap = new HashMap<>();
        // TODO: fill the map
        BikeParserStrategy bikeParserStrategy = new BikeParserStrategy(parsersMap);
        FileService fileService = new FileServiceImpl();
        List<List<String>> data = fileService.readFile("test.txt");
        for (List<String> row : data) {
            AbstractBike bike = bikeParserStrategy.getBike(row);
            Storage.bikes.add(bike); // Use DAO if applicable
        }
    }
}
