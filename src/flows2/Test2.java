package flows2;

public class Test2 {
    private int counter;
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.doWork();

    }
    public synchronized void increment(){
        counter++;
    }
    public void doWork(){
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
//                counter = counter + 1;
                increment();
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                increment();
        });

        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
