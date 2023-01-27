package collection4;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, String> map = new HashMap<>();

        collection.add("one");
        collection.add("two");
        collection.remove("two");
        System.out.println(collection.size());
        for (String s: collection){
            System.out.println(s);
        }

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.get(2);

        set.add("zero");
        set.add("one");
        set.add("two");
        set.add("three");

        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer("four"));
        for (String s: queue){
            System.out.println(s);
        }

        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");

        map.remove("1");
        map.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
