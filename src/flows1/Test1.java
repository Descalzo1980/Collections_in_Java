package flows1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutDown();
    }
}
class MyThread extends Thread{
    private volatile boolean running = true;

    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutDown(){
        this.running = false;
    }
}

/*
* для избежания когерентности (взаимосвязи)
* используй volatile(типа не кэшируй её)
* */
