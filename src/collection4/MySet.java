package collection4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();  // нет порядка
        Set<String> linkedHashSet = new LinkedHashSet<>(); // сохраняет порядок ввода
        Set<String> treeSet = new TreeSet<>(); // объекты сортируются в естественном порядке

        hashSet.add("Boo");
        hashSet.add("Alex");
        hashSet.add("Mike");
        hashSet.add("Alice");
        hashSet.add("John");
        hashSet.add("King");
        hashSet.add("King");
        hashSet.add("King");

        for (String name : hashSet){
            System.out.println(name);
        }

        System.out.println(hashSet);
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("King"));
//        linkedHashSet.add("Boo");
//        linkedHashSet.add("Alex");
//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Alice");
//        linkedHashSet.add("John");
//        linkedHashSet.add("King");
//
//        for (String name : linkedHashSet){
//            System.out.println(name);
//        }

//        treeSet.add("Boo");
//        treeSet.add("Alex");
//        treeSet.add("Mike");
//        treeSet.add("Alice");
//        treeSet.add("John");
//        treeSet.add("King");
//
//        for (String name : treeSet){
//            System.out.println(name);
//        }
    }
}
