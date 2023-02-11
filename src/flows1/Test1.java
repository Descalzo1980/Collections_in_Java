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

/*
* override fun onViewCreated(
 view: View,
 savedInstanceState: Bundle?
) {
 // DO NOT DO THIS!
 myButton.setOnClickListener {
 Thread {
 val status = doTimeConsumingThing()
 view.findViewById<TextView>(R.id.textview_second)
 .setText(status)
 }
 .start()
 }
 *
 * override fun onViewCreated(
 view: View,
 savedInstanceState: Bundle?
) {
 // DO NOT DO THIS EITHER!
 myButton.setOnClickListener {
 Thread {
 val status = doTimeConsumingThing()
 view.post {
 view.findViewById<TextView>(R.id.textview_second)
 .setText(status)
 }
 }
 .start()
 }
}
}*/
