package collection4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        System.out.println(myLinkedList);
//
//        System.out.println(myLinkedList.get(2));
//
//        myLinkedList.remove(0);
//
//        System.out.println(myLinkedList);

        List<Integer> integerList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000;i++){
            integerList.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000;i++) {
            arrayList.add(i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
