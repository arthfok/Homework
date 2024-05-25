package lesson4.task3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<>();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        set.add(person1);
        set.add(person2);
        set.add(person3);

        for (Person p : set) {
            System.out.println(p);
        }

        set.remove(person1);
        set.remove(person2);

        System.out.println(set);
    }
}
