package lesson7;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Market {
    private static final int SIMULATION_TIME = 2;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < SIMULATION_TIME * 60; i++) {
            int buyersCount = new Random().nextInt(3);
            for (int j = 0; j < buyersCount; j++) {
                Buyer buyer = new Buyer("Buyer " + (i * 3 + j));
                executorService.execute(buyer);
            }
            try {
                TimeUnit.SECONDS.sleep(1); // Каждую секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
