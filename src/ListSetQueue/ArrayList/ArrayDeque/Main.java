package ListSetQueue.ArrayList.ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Россия");
        states.add("Франция");

        states.push("Великобритания");

        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null){
            System.out.println(states.pop());
        }
        System.out.println("Размер очереди " + states.size());


        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst((new Person("Tom")));
        people.addLast((new Person("Alex")));
        for (Person p : people){
            System.out.println(p.getName());
        }
    }
}
