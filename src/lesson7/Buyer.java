package lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Buyer implements IBuyer, IUseBasket, Runnable {

    private final String NAME;
    private final Random random = new Random();

    public Buyer(String name) {
        this.NAME = name;
    }


    @Override
    public void enterToMarket() {
        System.out.println(NAME + " entered to the market");
    }

    @Override
    public void chooseGoods() {
        try {
            Thread.sleep(random.nextInt(1501) + 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void goOut() {
        System.out.println(NAME + " went out from the market");
    }

    @Override
    public void takeBasket() {
        System.out.println(NAME + " took the basket");
    }

    @Override
    public void putGoodsToBasket() {
        int numberOfGoods = random.nextInt(4) + 1;

        ArrayList<String> basket = new ArrayList<>();
        String[] keyGoods = Goods.getGoods().keySet().toArray(new String[0]);

        try {
            for (int i = 0; i < numberOfGoods; i++) {
                Thread.sleep(random.nextInt(1501) + 500);
                basket.add(keyGoods[random.nextInt(keyGoods.length)]);
            }
            System.out.println(NAME + " shopping list: " + basket);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }
}
