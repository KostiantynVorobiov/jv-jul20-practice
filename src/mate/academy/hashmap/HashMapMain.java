package mate.academy.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class HashMapMain {
    public static void main(String[] args) {
        // card-0001 : user info
        Map<String, LibraryUser> libraryUserMap = new HashMap<>();
        libraryUserMap.put("card-0001", new LibraryUser());

        // get all books rent by user with card number card-0001:
        LibraryUser libraryUser = libraryUserMap.get("card-0001");
        List<String> books = libraryUser.getBooks();

        Map<String, Double> fruitShop = new HashMap<>();
        fruitShop.put("banana", 11.50);

        Double bananaPrice = fruitShop.get("banana");


        // How put method works?

        // hashMap.put("abc", "hello");

        // 1. Get key, calculate it's hashCode --> int hash = "abc".hashCode();
        // 2. Find the position (bucket) where to add the value
        // 3. Check if key already exists
            // 3.1 if exists -> replace the value
            // 3.2 if not -> step 4
        // 4. Create Node<k,V> instance
        // 5. Add new created node into the LL



        int c = 4 + 5;  // O(1)
        int d = c + 19; // O(1)
        // O(1) + O(1) = 2 O(1) ---> O(1)
        for (int i = 0; i < 10; i++) { // n ---> O(n)
            c = c + 5;  // O(1)
        }
        // O(1) + O(1)  + O(n) ---> O(n)

        for (int i = 0; i < 20; i++) { // m
            for (int j = 0; j < 10; j++) { // n
                // O(1)
            }
        }

        // O(m) * O(n) --> m == n? ---> O(n) * O(n) --> O(n^2)
















    }
}
