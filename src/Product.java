import java.util.HashMap;
import java.util.Map;

public class Product implements Range { //создаём отдельный класс для ассортимента продуктов питания.

    public static final Product PRODUCT_RANGE = new Product();

    private static final Map<String, Integer> products = new HashMap<>() {{
        put("Хлеб", 56);
        put("Масло", 153);
        put("Колбаса", 211);
        put("Пирожок", 45);
    }};

    protected Product() {
    }

    public static Product getProduct() {
        return PRODUCT_RANGE;
    }

    @Override
    public Map<String, Integer> getRange() {
        return products;
    }

    public void printProduct() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}