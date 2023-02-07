package collection4;

import java.util.*;

public class EqualsHash {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();


        Person person  = new Person(1,"Boo");
        Person person1 = new Person(1,"Boo");
        map.put(person,"123");
        map.put(person1,"456");

        set.add(person);
        set.add(person1);
        System.out.println(person.equals(person1));
        System.out.println(map);
        System.out.println(set);

    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


/* надо-надо переопределять equals hash или
* //        Person person  = new Person(1,"Boo");
//        Person person1 = new Person(1,"Boo");
*
* иначе Джава не будет знать как их сравнивать
* */