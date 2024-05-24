package lesson2.task1;

public interface Vehicle {
    
    default void start() {
        System.out.println("Car started");
    }
    
    default void stop() {
        System.out.println("Car stopped");
    }

    String getFuelType();

}
