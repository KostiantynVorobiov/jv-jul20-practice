package mate.academy.exam.hashmap;

import java.util.Map;
import java.util.Map.Entry;

public class HashMapUsage1 {
  public static int calculateSum(Map<String, Integer> data, String keyPart) {
    int totalSum = 0;
    for(Map.Entry<String, Integer> entry : data.entrySet()) {
      if(entry.getKey().toLowerCase().contains(keyPart.toLowerCase())) {
         totalSum += entry.getValue();
      }
    }
    return totalSum;
  }

  public static int calculateSumA(Map<String, Integer> data, String keyPart) {
    int totalSum = 0;
    for (String key : data.keySet()) {
      if (key.toLowerCase().contains(keyPart.toLowerCase())) {
        totalSum = totalSum + data.get(key);
      }
    }
    return totalSum;
  }
}
