package flows7;

import java.util.LinkedList;
import java.util.Queue;

public class Test7 {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer waitAndNotify = new ProducerConsumer();

        Thread thread1 = new Thread(() -> {
            try {
                waitAndNotify.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                waitAndNotify.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final Object lock = new Object();
    public void produce() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (lock){
                int LIMIT = 10;
                while (queue.size() == LIMIT){
                    lock.wait();
                }
               queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true){
            synchronized (lock){
                while (queue.size() == 0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}


