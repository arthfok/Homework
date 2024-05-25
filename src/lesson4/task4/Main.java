package lesson4.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student student1 = new Student("Alex", 2, 1, 3);
        Student student2 = new Student("John", 1, 3, 3.6);
        Student student3 = new Student("Olga", 1, 1, 4.7);
        Student student4 = new Student("Robert", 1, 2, 2.9);
        Student student5 = new Student("Vladimir", 2, 3, 2.5);
        Student student6 = new Student("Pavel", 2, 2, 4.4);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        Iterator<Student> studentIterator = list.iterator();

            while (studentIterator.hasNext()) {
                Student s = studentIterator.next();
                switch (s) {
                    case Student p when p.getGrade() < 3 -> studentIterator.remove();
                    case Student p when p.getGrade() >= 3 -> p.setCourse(p.getCourse() + 1);
                    default -> System.out.println("Unknown student");
                }
            }

        printStudents(list, 2);
    }

    public static void printStudents(List<Student> list, int course) {
        for (Student s : list) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
