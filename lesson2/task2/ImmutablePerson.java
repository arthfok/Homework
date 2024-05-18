package lesson2.task2;

import java.util.List;

final class ImmutablePerson {

    final String name = "Alex";
    final int age = 22;
    List<String> hobbies = List.of("Football", "Gaming");

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" + "name = '" + name + "' "
                + ", age = " + age
                + ", hobbies = " + getHobbies()
                + "}";
    }
}
