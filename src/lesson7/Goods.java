package lesson7;

import java.util.HashMap;

public class Goods {

    private static final HashMap<String, Integer> goods = new HashMap<>();

    static {
        goods.put("Milk", 70);
        goods.put("Bread", 30);
        goods.put("Butter", 150);
        goods.put("Water", 50);
        goods.put("Meal", 500);
        goods.put("Potato", 100);
    }

    public static HashMap<String, Integer> getGoods() {
        return goods;
    }

}
