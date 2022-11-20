package ListSetQueue;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

//        Integer size = arrayList.size();
//        System.out.println(size);

        arrayList.add("Stas");
        arrayList.add("Bob");
        arrayList.add("Alex");
        arrayList.add("Oak");
        arrayList.add(3,"30");

        for (String s : arrayList) {
            System.out.println(s);
        }

//        for (String i : arrayList){
//            System.out.println(i);
//        }
//        System.out.println("***********************************************");
//        arrayList.add(1,"Dog");
//
//        for (String i : arrayList){
//            System.out.println(i);
//        }
//        System.out.println("***********************************************");
//        arrayList.remove(2);
//
//        for (String i : arrayList){
//            System.out.println(i);
//        }
//        System.out.println("***********************************************");
//        arrayList.remove("Stas");
//
//        for (String i : arrayList){
//            System.out.println(i);
//        }
//        System.out.println("***********************************************");
//        Integer result = arrayList.indexOf("Stas");
//        System.out.println(result);
//        for (String i : arrayList){
//            System.out.println(i);
//        }
//
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            integerArrayList.add(i);
            System.out.println(integerArrayList.get(i) + "\n ");
            System.out.println("\n" + integerArrayList.size());
        }

        for (int i = 0; i < 50; i++) {
            integerArrayList.remove(0);
            System.out.println(integerArrayList.get(i) + "\n ");
            System.out.println("\n" + integerArrayList.size());
        }

        integerArrayList.trimToSize();
        System.out.println("\n" + integerArrayList.size());
    }
}
