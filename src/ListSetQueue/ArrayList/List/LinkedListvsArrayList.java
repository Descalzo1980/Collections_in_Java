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

    public static long getTimeOfInsert(List<Integer> list) {
        Date currentTime = new Date();
        insert100000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Заняло времени: " + msDelay + " в мс");
        return msDelay;
    }

    public static void insert100000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
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


