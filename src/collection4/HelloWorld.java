package collection4;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set;
        Queue<String> queue;
        Map<String, String> map;

        collection.add("one");
        collection.add("two");
        collection.remove("two");
        System.out.println(collection.size());
        for (String s: collection){
            System.out.println(s);
        }

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

    }
}
