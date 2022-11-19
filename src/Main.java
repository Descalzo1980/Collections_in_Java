
public class Main {
    public static void main(String[] args) {

//        Collection<Integer> list = new ArrayList<>();
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
//        System.out.println("Первый лист " + list + " " + "\nРазмер " + list.size() );
//
///*        list.clear();
//        System.out.println(list.size());
//      System.out.println(list.isEmpty());
//*/
//        Object[]arr = list.toArray();
//
//        for (Object o : arr) {
//            System.out.println(o); // ого
//        }

        // Итератор

        int[] x = {1,2,3,4,5};
        for (int j : x) {
            ++j;
            System.out.println(j);
        }

        int[] x1 = {1,2,3,4,5};
        for (int j : x1) {
            System.out.println(j);
        }

//        list.iterator().next();

    }
}
