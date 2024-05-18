package lesson2.task1;

public class Runner {

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.start();
        sedan.stop();
        System.out.println("Fuel type: " + sedan.getFuelType());
        System.out.println("Trunk capacity: " + sedan.getTrunkCapacity());
        System.out.println("Number of doors: " + sedan.getNumberOfDoors());
        System.out.println("Luxury level: " + sedan.getLuxuryLevel());
        System.out.println();

        Truck truck = new Truck();
        truck.start();
        truck.stop();
        System.out.println("Fuel type: " + truck.getFuelType());
        System.out.println("Trunk capacity: " + truck.getTrunkCapacity());
        System.out.println("Number of doors: " + truck.getNumberOfDoors());
        System.out.println("Max load capacity: " + truck.getMaxLoadCapacity());
        System.out.println();
    }
}
