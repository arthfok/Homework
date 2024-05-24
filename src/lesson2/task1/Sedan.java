package lesson2.task1;

public class Sedan extends Car {

    public Sedan() {
        System.out.println("Sedan info:");
    }

    @Override
    public int getNumberOfDoors() {
        return 4;
    }

    @Override
    public int getTrunkCapacity() {
        return 350;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    public String getLuxuryLevel() {
        return "Luxury";
    }
}
