import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        list.addAll(secondList);
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(i);
        }
    }
}
