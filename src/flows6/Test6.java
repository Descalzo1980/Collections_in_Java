package flows6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
//            wait(); // 1 - отдаем intrinsic lock, ждем notify на этом объекте
            wait(4000);
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(2000);
            Scanner scanner = new Scanner(System.in);
            synchronized (this){
                System.out.println("Waiting for return key pressed");
                scanner.nextLine();
                notify();

                Thread.sleep(5000);
            }
        }
    }
}
