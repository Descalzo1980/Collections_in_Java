package flows3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        try {
            new Worker().main();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Worker{
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1= new ArrayList<>();
    private List<Integer> list2= new ArrayList<>();

    public void addToListOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }
    public synchronized void addToListTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }
    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToListOne();
            addToListTwo();
        }
    }
    public void main() throws InterruptedException {
       long before = System.currentTimeMillis();

        Thread thread1 = new Thread(this::work);

        Thread thread2 = new Thread(this::work);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
       long after = System.currentTimeMillis();

        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }
}
