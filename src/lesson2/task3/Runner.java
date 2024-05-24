package lesson2.task3;

public class Runner {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Ram ram = computer.new Ram();
        Computer.Processor processor = new Computer.Processor();

        System.out.println("Processor: " + processor.getDetails());
        System.out.println("RAM: " + ram.getDetails() + "gb");
    }
}
