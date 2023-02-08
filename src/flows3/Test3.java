package flows3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker{
    Random random = new Random();

    private List<Integer> list1= new ArrayList<>();
    private List<Integer> list2= new ArrayList<>();

    public void addToListOne() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(random.nextInt(100));
    }
    public void addToListTwo() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToListOne();
            addToListTwo();
        }
    }
    public void main(){
       long before = System.currentTimeMillis();
        work();
       long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }
}
