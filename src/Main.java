import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product products = new Product();
        products.printProduct();
        System.out.println("Введите название товара и количество или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
        purchase.printBasket();
    }
}