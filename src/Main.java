import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("RedCat", 4000);
        Animal dog = new Animal("Corgi", 5000);
        Animal bird = new Animal("Oak", 6000);

        Animal[] animals = {cat,dog,bird};

        for (Animal i : animals){
            i.price = i.price + 1;
        }
        for (Animal i : animals) {
            System.out.println(i.price);
        }
//       Collection<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.add(1));
//        System.out.println(list.size());
//        Collection<Integer> secondList = new ArrayList<>();
//        secondList.add(4);
//        secondList.add(5);
//        secondList.add(6);
//        list.addAll(secondList);
//        System.out.println("������ ���� " + list + " " + "\n������ " + list.size() );
//
//       list.clear();
//        System.out.println(list.size());
//      System.out.println(list.isEmpty());
//
//        Object[]arr = list.toArray();
//
//        for (Object o : arr) {
//            System.out.println(o); // ���
//        }
//
//        // ��������
//
//        int[] x = {1,2,3,4,5};
//        for (int j : x) {
//            ++j;
//            System.out.println(j);
//        }
//
//        int[] x1 = {1,2,3,4,5};
//        for (int j : x1) {
//            System.out.println(j);
//        }
//        System.out.println(Arrays.toString(x1));
//
//       list.iterator().next();

    }
}
