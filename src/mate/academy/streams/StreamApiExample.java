package mate.academy.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        Person alisa = new Person();
        alisa.setAge(20);
        alisa.setName("Alisa");

        Address alisaAddress = new Address();
        alisaAddress.setCity("Kyiv");
        alisaAddress.setStreet("Shevchenka");
        alisaAddress.setOldStreetNames(List.of("Old name 1", "Old name 2"));

        alisa.setAddress(alisaAddress);

        Person bob = new Person();
        bob.setAge(42);
        bob.setName("Bob");

        Address bobAddress = new Address();
        bobAddress.setCity("Kyiv");
        bobAddress.setStreet("Sadova");
        bobAddress.setOldStreetNames(List.of("Old sadova 1", "Old sadova 2"));

        bob.setAddress(bobAddress);

        List<Person> persons = new ArrayList<>();
        persons.add(alisa);
        persons.add(bob);

        //List all old addresses for persons who live in Kyiv and is younger than 25 and old street name contains "1"
    }
}
