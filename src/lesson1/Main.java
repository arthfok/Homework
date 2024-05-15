package lesson1;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Барсик");
        pet1.setAge(3);
        System.out.println("Имя:" +pet1.getName() + " Возраст:" + pet1.getAge());

        Pet pet2 = new Pet("Снежок", 5);
        System.out.println("Имя:" +pet2.getName() + " Возраст:" + pet2.getAge());

        Pet cat1 = new Cat();
        cat1.voice();

        Dog dog1 = new Dog();
        dog1.voice();
    }
}

class Pet {

    private String name;

    private int age;

    public Pet() {

    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Ням");
    }

    public void voice() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Cat extends Pet {

    private String owner;

    public Cat() {

    }

    public Cat(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

}

class Dog extends Pet {

    private String owner;

    public Dog() {

    }

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}