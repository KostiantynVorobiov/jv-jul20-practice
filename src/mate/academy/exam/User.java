package mate.academy.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 */
public class User implements Comparable<User> {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static User of(String data) {
        data.split(":");
        return new User();
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User alice = new User();
        alice.name = "Alice";
        alice.lastName = "ZYX";

        User bob = new User();
        bob.name = "Bob";
        bob.lastName = "Alison";

        User bob2 = new User();
        bob2.name = "Kenny";
        bob2.lastName = "Alison";

        User bob3 = new User();
        bob3.name = "Kenny";
        bob3.lastName = "Abisov";

        List<User> users = new ArrayList<>(List.of(alice, bob, bob2, bob3));

        System.out.println(users);

        // sout sorted values:

    }

    @Override
    public int compareTo(User o) {
        int lastName = getLastName().compareTo(o.lastName); // -1; 0; 1
        return lastName == 0 ? getName().compareTo(o.name) : lastName;
    }
}
