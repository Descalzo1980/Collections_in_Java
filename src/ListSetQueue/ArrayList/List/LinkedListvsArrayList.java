package ListSetQueue.ArrayList.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListvsArrayList {
    public static void main(String[] args) {
        System.out.println(getTimeOfInsert(new ArrayList()));
        System.out.println(getTimeOfInsert(new LinkedList()));
    }

    public static long getTimeOfInsert(List list) {
        Date currentTime = new Date();
        insert100000(list);
        remove50000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Вставка заняла времени: " + msDelay + " в мс");
        getTimeOfRemove(list);
        return msDelay;
    }
    public static void getTimeOfRemove(List list){
        Date currentTimeRemove = new Date();
        remove50000(list);
        Date newTimeRemove = new Date();
        long msDelay = newTimeRemove.getTime() - currentTimeRemove.getTime();
        System.out.println("Удаление заняло времени : " + msDelay + " в мс");
    }

    public static void insert100000(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(new Object());
        }
    }

    public static void get5000(List list){
        list.get(5000);
    }
    public static void remove50000(List list){
        list.remove(500000);
    }
}

/*    Заняло времени: 38350 в мс index 0
38350 AL
    Заняло времени: 110 в мс
110 LL

Заняло времени: 16 в мс wth index
16
Заняло времени: 4 в мс
4
*/


