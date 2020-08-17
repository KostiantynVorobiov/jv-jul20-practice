package mate.academy.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KataMeeting {
    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        // 0. To UPPERCASE
        // 1. Split by ';' --. List<String> as a result

        s = s.toUpperCase();
        String[] names = s.split(";");
        List<User> users = new ArrayList<>();
        for (String value : names) {
            String name = value.split(":")[0];
            String lastName = value.split(":")[1];
            User user = new User();
            user.setName(name);
            user.setLastName(lastName);
            users.add(user);
        }

        System.out.println(users);
        Collections.sort(users);
        System.out.println(users);
    }
}
