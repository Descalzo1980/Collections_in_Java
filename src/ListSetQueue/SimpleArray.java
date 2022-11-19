package ListSetQueue;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Stas");
        arrayList.add("Bob");
        arrayList.add("Alex");
        arrayList.add("Oak");
        for (String i : arrayList){
            System.out.println(i);
        }
        System.out.println("***********************************************");
        arrayList.add(1,"Dog");

        for (String i : arrayList){
            System.out.println(i);
        }
        System.out.println("***********************************************");
        arrayList.remove(2);

        for (String i : arrayList){
            System.out.println(i);
        }
        System.out.println("***********************************************");
        arrayList.remove("Stas");

        for (String i : arrayList){
            System.out.println(i);
        }
    }
}
