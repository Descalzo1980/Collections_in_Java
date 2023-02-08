package collection4;

import java.util.*;

public class MyComporator {
    public static void main(String[] args) {
        List<PersonMy> peopleList = new ArrayList<>();
        Set<PersonMy> personMySet = new TreeSet<>();

        addElements(peopleList);
        addElements(personMySet);

        System.out.println(peopleList);
        System.out.println(personMySet);

        Collections.sort(peopleList);

    }
    private static void addElements(Collection collection){
        collection.add(new PersonMy(1,"Boo"));
        collection.add(new PersonMy(2,"Twortyry"));
        collection.add(new PersonMy(3,"Lastrtyrytry"));
        collection.add(new PersonMy(4,"Lastrtyrytryuiouou"));
    }
}

class PersonMy implements Comparable<PersonMy>{
    private int id;
    private String name;

    public PersonMy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonMy)) return false;
        PersonMy personMy = (PersonMy) o;
        return id == personMy.id && Objects.equals(name, personMy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PersonMy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonMy o) {
//        return Integer.compare(this.id, o.getId());
        return Integer.compare(o.name.length(), this.getName().length());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
