//import java.util.Arrays;
//
//public class SimpleComparableStudents implements Comparable<SimpleComparableStudents>{
//    public String firstName;
//
//    public SimpleComparableStudents(String firstName, int group) {
//        this.firstName = firstName;
//        this.group = group;
//    }
//
//    private final int group;
//
//    @Override
//    public String toString() {
//        return  firstName + " " + group;
//    }
//
//    @Override
//    public int compareTo(SimpleComparableStudents o) {
//        return Integer.compare(this.group, o.group);
//
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//
//        SimpleComparableStudents[] simpleComparableStudents = {
//                new SimpleComparableStudents("Alex", 122),
//                new SimpleComparableStudents("Boo", 1110),
//                new SimpleComparableStudents("Oak", 138),
//                new SimpleComparableStudents("Sam", 444),
//                };
//        Arrays.sort(simpleComparableStudents);
//
//        for (SimpleComparableStudents simpleComparableStudent : simpleComparableStudents) {
//            System.out.println(simpleComparableStudent);
//        }
//    }
//}
