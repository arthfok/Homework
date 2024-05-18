package lesson2.task1;

public class Truck extends Car {

    public Truck() {
        System.out.println("Truck info:");
    }

    @Override
    public int getNumberOfDoors() {
        return 2;
    }

    @Override
    public int getTrunkCapacity() {
        return 1000;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public int getMaxLoadCapacity() {
        return 19000;
    }
}
