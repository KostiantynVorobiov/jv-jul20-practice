package mate.academy.solid.service;

import java.util.List;

import mate.academy.solid.model.AbstractBike;

public interface BikeParser<T extends AbstractBike> {
    T parse(List<String> data);
}
