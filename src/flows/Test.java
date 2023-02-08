package flows;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
//        myThread.start();
//        System.out.println("I am going to sleep");
//        Thread.sleep(1000);
//        System.out.println("I am awake");

        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello from main thread");
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i <= 10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello threads from MyThread " + i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0;i <= 10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello threads from MyThread " + i);
        }
    }
}
