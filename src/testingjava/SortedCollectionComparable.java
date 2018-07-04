package testingjava;

import java.util.*;

class Student implements Comparable<Student> {
    private int rollNumber;
    private String studentName;
    private int markScored;

    //    @Override
//    public int compareTo(Student o) {
//        return (this.markScored - o.markScored);
//    }
    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }

     Student(int rollNumber, String studentName, int markScored) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.markScored = markScored;
    }

    public String toString() {
        return "Roll Number: " + rollNumber + " Student Name: " + studentName + " Mark Scored:" + markScored;
    }
}

public class SortedCollectionComparable {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student(1, "Amit", 97));
        set.add(new Student(2, "Mandeep", 70));
        set.add(new Student(3, "Ankush", 80));

        for (Student student:set){
            System.out.println(student);
        }


    }

}
