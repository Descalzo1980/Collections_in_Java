import java.util.Arrays;
import java.util.Iterator;

public class SimpleComparableStudents implements Comparable<SimpleComparableStudents>{
    public String firstName;

    public SimpleComparableStudents(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    private final int group;

    @Override
    public String toString() {
        return  firstName + " " + group;
    }

    @Override
    public int compareTo(SimpleComparableStudents o) {
        return this.group - o.group;
    }
}

class Main{
    public static void main(String[] args) {

        SimpleComparableStudents[] simpleComparableStudents = {
                new SimpleComparableStudents("Alex", 22),
                new SimpleComparableStudents("Boo", 11),
                new SimpleComparableStudents("Oak", 13),
                new SimpleComparableStudents("Sam", 444),
                };
        Arrays.sort(simpleComparableStudents);

        for (SimpleComparableStudents simpleComparableStudent : simpleComparableStudents) {
            System.out.println(simpleComparableStudent);
        }
    }
}
