//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Animal cat = new Animal("RedCat", 7000, 22, 500);
//        Animal dog = new Animal("Corgi", 2000, 22, 29);
//        Animal bird = new Animal("King Penguin", 17000, 6, 50);
//
//        Animal[] animals = {cat, dog, bird};
//        Arrays.sort(animals);
//        for (Animal i : animals)
//            System.out.println(i);

// Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to java.lang.Comparable
//        Нужно реализовать Comparable
//        Animal cat = new Animal("RedCat", 4000);
//        Animal dog = new Animal("Corgi", 5000);
//        Animal bird = new Animal("Oak", 6000);
//        ArrayList<Animal> animalArrayList = new ArrayList<>();
//        animalArrayList.add(cat);
//        animalArrayList.add(dog);
//        animalArrayList.add(bird);
//
//        Iterator<Animal> animalIterator = animalArrayList.iterator();
//
//        while (animalIterator.hasNext()){
//            Animal i = animalIterator.next();
//            i.price += 1000;
//        }
//        System.out.println(animalArrayList);
//
//        System.out.println(cat.getBread());
//        System.out.println(cat.getPrice());
//        System.out.println(cat.getClass());

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//
//
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            System.out.println(i);
//        }
//
//        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()){
//            Integer i = listIterator.next();
//            System.out.println(i);
//        }


//        Animal cat = new Animal("RedCat", 4000);
//        Animal dog = new Animal("Corgi", 5000);
//        Animal bird = new Animal("Oak", 6000);
//
//        Animal[] animals = {cat,dog,bird};
//
//        for (Animal i : animals){
//            i.price = i.price + 1;
//            System.out.println(i.price);
//        }
//        for (Animal i : animals) {
//            System.out.println(i.bread + " " + i.price);
//        }
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
//        System.out.println("Первый лист " + list + " " + "\nРазмер " + list.size() );
//
//       list.clear();
//        System.out.println(list.size());
//      System.out.println(list.isEmpty());
//
//        Object[]arr = list.toArray();
//
//        for (Object o : arr) {
//            System.out.println(o); // ого
//        }
//
//        // Итератор
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

//    }
//}
