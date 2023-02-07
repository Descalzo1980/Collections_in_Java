package collection4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();// порядок не соблюдается, ключи уникальные, значения любые
        Map<Integer,String> map1 = new TreeMap<>(); // сортировка по ключу
        Map<Integer,String> map2 = new LinkedHashMap<>();// порядок гарантирован добавления ключ значение
//        map.put("One", 1);
//        map.put("Two", 2);
//        map.put("Three", 3);
//        map.put("Five", 5);
//        map.put("Six", 6);
//        map.put("Seven", 7);
//        map.put("Eight", 8);
//        map.forEach((key, value) -> System.out.println("Key: " + key + " Value " + value));

        testMap(map);
        System.out.println("*****");
        testMap(map1);
        System.out.println("*******");
        testMap(map2);

    }

    public static void testMap(Map<Integer,String> map){
        map.put(3456,"Bob");
        map.put(3555,"Alex");
        map.put(3687,"Boo");
        map.put(3766,"Ma");
        map.put(3800,"Lolo");
        map.put(39,"Lili");
        map.forEach ((key,value) -> System.out.println("Key: " + key + " Value " + value));
    }
}
