package collection4;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();// порядок не соблюдается
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.forEach((key, value) -> System.out.println("Key: " + key + " Value " + value));
    }
}
