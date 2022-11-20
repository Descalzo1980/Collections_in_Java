package ListSetQueue.ArrayList.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListvsArrayList implements Runnable {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread currentThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
                System.out.println("LinkedList" + list.size());
            }
        });
            currentThread.start();

        Thread secondThread = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 10000; i++) {
                    arrayList.add(i);
                    System.out.println("Array list" + arrayList.size());

                }
            }
        };
        secondThread.start();
    }

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

}
