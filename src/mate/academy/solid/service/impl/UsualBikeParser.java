package mate.academy.solid.service.impl;

import java.util.List;

import mate.academy.solid.model.UsualBike;
import mate.academy.solid.service.BikeParser;

public class UsualBikeParser implements BikeParser<UsualBike> {
    @Override
    public UsualBike parse(List<String> data) {
        UsualBike bike = new UsualBike();
        bike.setYear(Integer.parseInt(data.get(3)));
        //TODO: implement
        return bike;
    }
}
