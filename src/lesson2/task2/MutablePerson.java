package lesson2.task2;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {

    String name = "Eva";
    int age = 18;
    ArrayList<String> hobbies = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Mutable{" + "name = '" + name + "' "
                + ", age = " + age
                + ", hobbies = " + getHobbies()
                + "}";
    }
}
