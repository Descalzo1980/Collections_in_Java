package collection4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueWork {
    public static void main(String[] args) {
//        Queue<String> stringQueue = new LinkedList<>();
//        Deque<String> stringDeque = new LinkedList<>();
//        Queue<String> priorityQueue = new PriorityQueue<>();
        QueuePeople queuePeople1 = new QueuePeople(1);
        QueuePeople queuePeople2 = new QueuePeople(2);
        QueuePeople queuePeople3 = new QueuePeople(3);
        QueuePeople queuePeople4 = new QueuePeople(4);

        Queue<QueuePeople> people = new ArrayBlockingQueue<QueuePeople>(3);
        System.out.println(people.offer(queuePeople3));
        System.out.println(people.offer(queuePeople4));
        System.out.println(people.offer(queuePeople1));
        System.out.println(people.offer(queuePeople2));
//        System.out.println(people.remove();
//        System.out.println(people.peek());
//        System.out.println(people.peek());
//        System.out.println(people.peek());
//        System.out.println(people.peek());
//        System.out.println(people.peek());
//        System.out.println(people.peek());
        for (QueuePeople queuePeople: people)
            System.out.println(queuePeople.toString());
    }
}

class QueuePeople{
    private int id;

    public QueuePeople(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QueuePeople{" +
                "id=" + id +
                '}';
    }
}
