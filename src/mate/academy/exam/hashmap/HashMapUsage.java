package mate.academy.exam.hashmap;

import java.util.Map;

/**
 * What could be improved here?
 */
public class HashMapUsage {
  public static int calculateSum(Map<String, Integer> data, String keyPart) {
    int sum = 0;
    if (data != null) {
      for (Map.Entry<String, Integer> entry : data.entrySet()) {
        if (keyPart == null) {
          sum += entry.getValue();
        } else if (entry.getKey().toLowerCase().contains(keyPart.toLowerCase())) {
          sum += entry.getValue();
        }
      }
      return sum;
    }
    return 0;
  }
}
