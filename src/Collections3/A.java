package Collections3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class A {
    public static void main(String[] args) {
        if (one() & two() | one()) {
            System.out.print("three");
        }
    }
    private static boolean two() {
        System.out.print("two");
        return false;
    }
    private static boolean one() {
        System.out.print("one");
        return true;
    }
}
