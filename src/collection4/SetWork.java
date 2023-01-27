package collection4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetWork {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // random order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.add("six");
        for (String s : hashSet){
            System.out.println(s);
        }
    }
}
