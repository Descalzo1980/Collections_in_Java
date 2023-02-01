package collection4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetWork {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // random order
        Set<String> linkedHashSet = new LinkedHashSet<>(); // хранит в порядке добавления
        Set<String> treeSet = new TreeSet<>(); // отсортированная коллекция


        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.add("six");
        for (String s : hashSet){
            System.out.println(s);
        }
        System.out.println("*");
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        linkedHashSet.add("six");
        for (String s : linkedHashSet){
            System.out.println(s);
        }

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        treeSet.add("six");
        for (String s : treeSet){
            System.out.println(s);
        }
    }
}

