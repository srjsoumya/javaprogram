package testingjava;

import java.util.*;

class Employee {
    private int empNumber;
    String empName;
    long salary;

    Employee(int empNumber, String empName, long salary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee number:  " + empNumber + "\nEmployee name: " + empName + "\n" +
                "Salary: " + salary + "\n********";
    }
}

class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.salary - o2.salary);
    }
}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empName.compareTo(o2.empName);
    }
}

public class SortCollectionComparator {
    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee(12345, "Soumya", 34000));
        list.add(new Employee(23456, "Amit", 29000));
        list.add(new Employee(34567, "Mandeep", 20000));
        list.add(new Employee(89754, "Ankush", 22000));

        System.out.println("Sorted by Salary");
        list.sort(new SortBySalary());
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("Sorted By Name");
        list.sort(new SortByName());
        for (Employee emp : list) {
            System.out.println(emp);
        }

    }
}
