package collection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInJava {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        List<PersonComparator> personComparatorList = new ArrayList<>();

        personComparatorList.add(new PersonComparator(1,"Boo"));
        personComparatorList.add(new PersonComparator(2,"Two"));
        personComparatorList.add(new PersonComparator(3,"Last"));
        personComparatorList.add(new PersonComparator(0,"Four"));

        Collections.sort(personComparatorList, new Comparator<PersonComparator>() {
            @Override
            public int compare(PersonComparator o1, PersonComparator o2) {
                return Integer.compare(o1.getId(),o2.getId());
            }
        });

        System.out.println(personComparatorList);

//        animals.add(("cat"));
//        animals.add(("dog"));
//        animals.add(("bird"));
//        animals.add(("lion"));
//        animals.add(("a"));
//        animals.add(("ab"));
//        animals.add(("abcdef"));
//        animals.add(("abcdef"));
//        animals.add(("zzzzzzzzzzzzzz"));
//
//        Collections.sort(animals,new StringLengthComparator());
//        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(500);
        numbers.add(100);
        numbers.add(5009);

        Collections.sort(numbers, new BackwardsIntegerComparator());
        Collections.sort(numbers, (o1, o2) -> {
            if (o1 > o2){
                return -1;
            } else if (o1 < o2) {
                return 1;
            }else {
                return 0;
            }
        });
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //        return Integer.compare(o1.length(), o2.length());
        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }else {
        return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
        if (o1 > o2){
            return -1;
        } else if (o1 < o2) {
            return 1;
        }else {
            return 0;
        }
    }
}

class PersonComparator{
    private int id;
    private String name;

    public PersonComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}