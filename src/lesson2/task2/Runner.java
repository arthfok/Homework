package lesson2.task2;

public class Runner {

    public static void main(String[] args) {

        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.hobbies.add("Singing");
        mutablePerson.hobbies.add("Piano");
        mutablePerson.setName("Adam");
        mutablePerson.setAge(33);
        System.out.println(mutablePerson.toString());

        ImmutablePerson immutablePerson = new ImmutablePerson();
        System.out.println(immutablePerson.toString());
        immutablePerson.getHobbies().add("Dancing"); //UnsupportedOperationException

    }
}
