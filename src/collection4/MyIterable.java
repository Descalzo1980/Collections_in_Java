package collection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int index = 0;
        while (iterator.hasNext()) {
            if(index == 1)
                iterator.remove();
            System.out.println(iterator.next());
            index++;
            }
        System.out.println(list);
        }
    }
